function[] = performance_gains()
    
    close all;
    clear all;

    function[] = plotPerformanceGain(ll, fl)
        part = 1;
        msize_exp = 7;
        msize=exp(msize_exp*log(10));

        loads = logspace(0,msize_exp,300)
        opes = logspace(0,msize_exp,300)

        f = @(l,o) ceil(l/(part*o))*(fl(msize/o)+ll(o));

        times=zeros(length(loads), length(opes));
        for i=1:length(loads)
           for ii=1:length(opes)
                times(i, ii)=f(loads(i), opes(ii));
           end
        end
        
        t_min = 0;
        t_max = ll(msize);
        v=ceil(logspace(-2, log(t_max)/log(10), 10));
        [C,h] = contour(opes, loads, times, v)
        
        
%         hold on; 
%         [C,g] = contour(opes,loads,times,1:1:1000); % Create standard contour plot first 
%         clabel(C,g,'Rotation',0, 'LabelSpacing', 2000);
%         colormap(jet); % Create custom colormap 
%         h = colorbar; % Add colorbar                 
%         set(h,'YScale','log'); % Change colorbar scale to log 
%         hold(h); % Hold the colorbar  
%         cla; % Clear contour plot 
%         [C,g] = contour(opes,loads,log10(times),10); % Plot log10 data, keeping the logarithmic 
%         % colorbar for the original data 
        
        axis tight % Fill entire axes with contour plot
        
        
        xlabel('objects per entry');
        ylabel('size of loaded model');       
        set(gca, 'YScale', 'log');
        set(gca, 'XScale', 'log');
        colorbar('hide');
        
        clabel(C, 'manual');               
    end

    figure;
    subplot(1,2,1)
    [m_emf, n_emf] = emf_xmi_perf(4);
    subplot(1,2,2)
    [m_hbase, n_hbase] = hbase_lookup_perf();
    
    ll= @(s) m_emf*s;%+n_emf;
    fl= @(k) m_hbase*log(k);%+n_hbase;
    
    figure(2);
    plotPerformanceGain(ll, fl);
    title('time it takes to load a model based on measured times (in ms)');    
    
    ll= @(s) s;
    fl= @(k) log(k);
    
    figure(3);
    plotPerformanceGain(ll, fl);
    title('time it takes to load a model theoretical model (in time units)');
    
end
    