function [m,n] = hbase_lookup_perf()
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

    ommit_first = 4;
    rx = rx(ommit_first:end)
    ry = ry(ommit_first:end)
    rx_log = log(rx)
    scatter(rx,ry);
    hold on;
    
    pf = polyfit(rx_log,ry,1);
    m = pf(1);
    n = pf(2);
    
    e = @(x) m*log(x)+n;

    plot(rx, e(rx));

    xlabel('number of data store keys');
    ylabel('access execution time (in ms)');
    

    %set(gca, 'YScale', 'log')
    %set(gca, 'XScale', 'log')

end