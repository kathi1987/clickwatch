function [m,n] = emf_xmi_perf(x2_f)

    runCol = 1;
    x2Col = 2;
    xCol = 3;
    yCol = 4;

    import = importdata('2012-01-10-emf-xmi-perf-2.csv');
    data = import;

    Xs = unique(data(find(data(:,runCol)==0),xCol));
    x2s = unique(data(find(data(:,runCol)==0),x2Col));


    i = 1;
    for x2_i=1:size(x2s)
        x2 = x2s(x2_i)
        for x_i=1:size(Xs)
            x = Xs(x_i);
            index = find(data(:, xCol) == x & data(:,x2Col) == x2);        
            y = mean(data(index,yCol));
            rx(i,:) = x;
            ry(i,:) = y;
            rz(i,:) = x2;
            i = i + 1;
        end
    end
    
    figure('Position',[900,100,450,200]);
    index = find(rz(:)==x2_f);
    scatter(rx(index),ry(index));
    pf = polyfit(rx(index), ry(index), 1);   
    m = pf(1);
    n = pf(2);
    
    hold on
    plot(rx(index), rx(index)*m+n, '-r');
    
    xlabel('number of parsed objects [s]');
    ylabel('parse time [parse(s)] (in ms)');
    

    legend('XMI parser measurements', 'Linear fit','Location', 'NorthWest');

    set(gca, 'YScale', 'log')
    set(gca, 'XScale', 'log')
    exportfig(gcf, 'emfParsePerf.eps', 'LineStyleMap', [], 'Color', 'rgb');
end