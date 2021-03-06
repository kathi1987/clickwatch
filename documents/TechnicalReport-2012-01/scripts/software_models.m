function[] = software_models()

    close all;
    hold off;

    LOC_ar = 4,3 / 1,8;
    LOC_am = 4,3 / 1,5;

    %apl = 59860931 / 11173227; for LOC
    apl = 59860931 / 9985630; % for SLOC
    apm = apl / 2;
    mpa = 1;

    % measurement: 59860931 AST nodes in 16589 C files with 11173227 with linux
    % kernel 3.2.1, measured using the CDT parser.

    function[] = plotSizes(LOC, years, at)

        % LOC_a / LOC_r = LOC_ar
        % dLOC = LOC[x] - LOC[x-1]
        % dLOC = LOC_a - LOC_r
        % 
        % LOC_a = LOC_ar*LOC_r
        % dLOC = LOC_r(LOC_ar - 1)
        %
        % LOC_r = dLOC/(LOC_ar-1)
        % LOC_a = LOC_ar*dLOC/(LOC_ar-1)

        sum_LOC = 0;
        r_LOC = 1:length(LOC); % prealloc
        rv_LOC = r_LOC;
        for i=1:length(LOC)
           if (i == 1) 
              sum_LOC = LOC(1) * apl * mpa;
              r_LOC(i) = sum_LOC;
              rv_LOC(i) = sum_LOC;      
           else
              LOC_y = LOC(i-1);
              LOC_x = LOC(i);
              dLOC = LOC_x - LOC_y;
              LOC_r = dLOC/(LOC_ar-1);
              LOC_a = LOC_ar*dLOC/(LOC_ar-1);

              sum_LOC = sum_LOC + (LOC_a)*apl*mpa + (LOC_a / LOC_am)*apl*mpa;
              rv_LOC(i) = sum_LOC;
              r_LOC(i) = LOC_x * apl * mpa;
           end

        end

        hold on
        plot(years, rv_LOC, '-ro');
        plot(years, r_LOC, '-gs');
        plot(years, LOC, '-bd');
        hleg = legend('model size with history','model size', 'SLOC');
        set(hleg,'Location','NorthWest')
        %set(gca, 'YScale', 'log');
        xlabel('time');
        ylabel('# of SLOC/objects'); 
        if (at == 1) 
            axis tight;
        end
        datetick('x','mm/yy','keepticks');
    end

    % plot linux kernel sizes
    fid = fopen('2012-01-18-kernel_size_info.csv', 'rt');
    a = textscan(fid, '%s %u %u %u', ...
           'Delimiter',',', 'CollectOutput',1, 'HeaderLines',1);
    fclose(fid);

    format short g;
    M = [datenum(a{1}) a{2}];

    subplot(1,3,1);
    plotSizes(M(:,2), M(:,1), 1);
    
    title('Linux Kernel');

    % plot debian linux
    debian_LOC = [ 57; 104; 215; 283; 324 ]*1e6;
    debian_years = datenum(['Aug/01/2000'; 'Jul/01/2002'; 'Jun/01/2005'; 'Apr/01/2007'; 'Feb/01/2009']);   
    subplot(1,3,2);
    plotSizes(debian_LOC, debian_years, 0);
    title('Debian Linux');
    
    % plot windows NT
    win_LOC = [ 4.5; 7.5; 11.5; 29; 45; 50 ]*1e6;
    win_years = datenum(['Dec/01/1993'; 'Dec/01/1994'; 'Dec/01/1996'; 'Dec/01/2000'; 'Dec/01/2001'; 'Dec/01/2003']);   
    subplot(1,3,3);
    plotSizes(win_LOC, win_years, 0);
    title('Windows NT/2000/XP/Server');
end