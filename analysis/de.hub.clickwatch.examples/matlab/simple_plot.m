clear;

data = xml2struct('linkstatinfo.xml');

link_stat = data.link_stats.link_stat;

allrates = [2 4 11 12 18 22 24 36 48 72 96 108];
lnk_stat = cell(size(allrates,2), 1);

for link_i=1:size(link_stat,2)
   pdr = str2num(link_stat{link_i}.Attributes.pdr);
   revpdr = str2num(link_stat{link_i}.Attributes.revpdr);
   bitRate = str2num(link_stat{link_i}.Attributes.bitRate);
   if (isempty(pdr))
      pdr = 0; 
   end
   if (isempty(revpdr))
      revpdr = 0; 
   end
   idx = find(allrates == bitRate);
   lnk_stat{idx} = [lnk_stat{idx}; pdr revpdr];
end

for ii=1:size(lnk_stat,1)
    if (isempty(lnk_stat{ii}))
        continue;
    end
   figure;
   scatter(lnk_stat{ii}(:,1), lnk_stat{ii}(:,2));
   grid on;
   xlabel('Forward PDR');
   xlabel('Reverse PDR');
   title(['Relationship Forward/Reverse PDR at ', num2str(allrates(ii)/2), ' Mbps']);
end