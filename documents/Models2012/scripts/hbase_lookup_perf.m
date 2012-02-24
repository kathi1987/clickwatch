function [m_l,n_l, m, n, pfc] = hbase_lookup_perf()
    runCol = 1;
    x2Col = -2;
    xCol = 2;
    yCol = 3;

    import = importdata('2012-01-11-hbase-lookup-perf-1.csv');
    data = import;

    Xs = unique(data(find(data(:,runCol)==0),xCol));
    x2s = 2;


    i = 1;
    for x2_i=1:size(x2s)
        x2 = x2s(x2_i)
        for x_i=1:size(Xs)
            x = Xs(x_i);
            index = find(data(:, xCol) == x);        
            y = mean(data(index,yCol));
            rx(i,:) = x;
            ry(i,:) = y;
            rz(i,:) = x2;
            i = i + 1;
        end
    end
    
    
    pfc = polyfit(rx,ry,5);

    rx_l = rx(1:10);
    ry_l = ry(1:10);
    
    figure('Position',[100,100,450,200]);
    hold on;    
    scatter(rx, ry);
    pf_l = polyfit(rx_l,ry_l,1);
    m_l = pf_l(1);
    n_l = pf_l(2);
    
    e_l = @(x) m_l*x+n_l;
    e_p = @(x) polyval(pfc,x);
    
    all = [0; 0.01; rx; 6e7];
    plot(all, e_l(all), '--r'); 
    ylim([0 12]);
    set(gca,'XTick', 0:1e7:6e7);
    
    %plot(all, e_p(all), '-r');
    
    xlabel('number of data store keys [#k]');
    ylabel('access time [access(#k)] (in ms)');
    
    %figure;
    
    %scatter(rx,ry);
    ommit_first = 4;
    
    rx = rx(ommit_first:end)
    ry = ry(ommit_first:end)
    
    rx_log = log(rx)
    
    %hold on;
    
    pf = polyfit(rx_log,ry,1);
    m = pf(1);
    n = pf(2);
    
    e = @(x) m*log(x)+n;

    plot(all(3:end), e(all(3:end)), ':k');

    %xlabel('number of data store keys');
    %ylabel('access execution time (in ms)');
    
    hold off;
    %set(gca, 'YScale', 'log')
    %set(gca, 'XScale', 'log')

end