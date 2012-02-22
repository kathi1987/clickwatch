function[] = performance_gains()
    
    close all;
    clear all;

    function[] = plotPerformanceGain(ll, fl, ordered)
        part = 1;
        msize_exp = 6;
        msize=exp(msize_exp*log(10));

        loads = logspace(0,msize_exp,300);
        opes = logspace(0,msize_exp,300);

        if ordered
            f = @(l,o) ceil(l/(part*o))*(ll(o)) + fl(msize/o);
        else
            f = @(l,o) ceil(l/(part*o))*(fl(msize/o)+ll(o));
        end      

        times=zeros(length(loads), length(opes));
        for i=1:length(loads)
           for ii=1:length(opes)
                times(i, ii)=f(loads(i), opes(ii));
           end
        end
        
% hold on;
% % Supply or load arrays for x, y, and z values from you contourf input
% [C,g] = contour(opes,loads,times,1:3:100); % Create standard contour plot first
% colormap([0 0 1;0 1 0]); % Create custom colormap
% h = colorbar; % Add colorbar
% set(h,'YScale','log'); % Change colorbar scale to log
% hold(h); % Hold the colorbar
% z2 = log10(times); % Take log10() of data
% cla % Clear contour plot
% contour(opes,loads,z2,0:.1:2); % Plot log10 data, keeping the logarithmic
% % colorbar for the original data
% axis tight % Fill entire axes with contour plot
        
        t_min = 0;
        t_max = ll(msize);
        %v=ceil(logspace(-2, log(t_max)/log(15), 15));
        v=[100 1000 10000 100000];
        [C,h] = contour(opes, loads, times, v)
                      
        axis tight % Fill entire axes with contour plot
                
        xlabel('Fragment size');
        ylabel('Number of loaded objects');       
        set(gca, 'YScale', 'log');
        set(gca, 'XScale', 'log');
        colorbar('hide');
        %clabel(C,h,'manual');
        %clabel(C,h, 'LabelSpacing', 100, 'Rotation', 0); 
    end

    function[] = plotPerformanceGainSimple(ll, fl, ordered)
        part = 1;
        msize_exp = 6;
        msize=exp(msize_exp*log(10));

        loads = logspace(0,msize_exp,20);
        opes = [1 10 100 1000 10000 100000 1000000];

        if ordered
            f = @(l,o) ceil(l/(part*o))*(ll(o)) + fl(msize/o);
        else
            f = @(l,o) ceil(l/(part*o))*(fl(msize/o)+ll(o));
        end      

        times=zeros(length(loads), length(opes));
        for i=1:length(opes)
            for ii=1:length(loads)           
                times(i, ii)=f(loads(ii), opes(i));
            end
        end
        
        p = loglog(loads, times(1,:),'->y', loads, times(2,:),'-sr', loads, times(3,:),'-vb', loads, times(4,:),'-dg', loads, times(5,:),'-^k', loads, times(6,:),'-<c', loads, times(7,:),'-om');
        set(p, 'LineWidth', 1);
        xlabel('Number of loaded objects');
        ylabel('Execution time (ms)');
        l = legend(p, num2str(opes', '%-u'),'Location','Best');
        t = get(l, 'title');
        set(t,'string','Fragment size');              
    end

    figure;
    subplot(2,1,1)
    [m_emf, n_emf] = emf_xmi_perf(4);
    title('EMF XMI parse performance');
    subplot(2,1,2)
    [m_hbase, n_hbase] = hbase_lookup_perf();
    title('HBase random access performance');
    
    ll= @(s) m_emf*s;%+n_emf;
    fl= @(k) m_hbase*log(k)%+n_hbase;
    
    figure(2);
    plotPerformanceGain(ll, fl, 0);
%     figure(3);
%     plotPerformanceGainSimple(ll, fl, 0);
%    title('time it takes to load a model based on measured times (in ms)');    
    
%     ll= @(s) s;
%     fl= @(k) log(k);
%     
%     figure(3);
%     plotPerformanceGain(ll, fl, 0);
%     title('time it takes to load a model theoretical model (in time units)');
%             
%     ll= @(s) m_emf*s;% + n_emf;
%     fl= @(k) 0;
%     
%     figure(4);
%     plotPerformanceGain(ll, fl, 1);
%     title('time it takes to load a model based on measured times in an ordered data store (in ms)');
    
end
    