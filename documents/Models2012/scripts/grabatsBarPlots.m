close all;
clear all;
query_time = [
    2133.4	3766.6	27116.4	141062.7 242597.0; 
    18703.9	46835.1	115795.2 280000 320000; 
    14225.9	34448.4	92144.2	247047.0 272939.3;
    1345.9	2444.7	15586.0	39963.4	43238.2;    
    4131.7	11333.9	27710.1	51155.5	55614.5;
    4058.7	10872.5	17210.8	30291.3	54858.9];

figure1 = figure('XVisual','');
set(figure1, 'Position', [100, 100, 450, 450*3/4]);
axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
    'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
    'XTick',[1 2 3 4 5]);
box(axes1,'on');
hold(axes1,'all');

colormap(bone(6));
bar(query_time'/1e3, 'Parent',axes1);
YLabel('Execution time (in s)');
legend('xmi', 'CDO', 'Morsa wo index', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
exportfig(gcf, 'grabatsQueryTime.eps', 'LineStyleMap', [], 'Color', 'rgb');  

% traverse
load_time = [ 1818	3541	27446	140410	241136;
    18855	47686	457979	1000000 1150000;
    17709	44074	421562	964655	1048259;
    3833	11239	33478	62606	68730;
    3892	10350	46972	99230	68146;];

figure1 = figure('XVisual','');
set(figure1, 'Position', [100, 100, 450, 450*3/4]);
axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
    'YScale','log','YMinorTick','on',...
    'YMinorGrid','on',...
    'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
    'XTick',[1 2 3 4 5]);
box(axes1,'on');
hold(axes1,'all');

colormap(bone(6));
bar(load_time'/1e3, 'Parent',axes1);
YLabel('Execution time (in s)');
legend('xmi', 'CDO', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
exportfig(gcf, 'grabatsTraverseTime.eps', 'LineStyleMap', [], 'Color', 'rgb');

%memory
memory = [ 34741397	99251404	745807894	1638047055	1765494183;
3282200	3268081	3842562	3994814	4122279;
4364742	6293135	6048543	5384703	5655025;
4323533	6251802	6065440	5403960	5649159;];

figure1 = figure('XVisual','');
set(figure1, 'Position', [100, 100, 450, 280]);
axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
    'YScale','log','YMinorTick','on',...
    'YMinorGrid','on',...
    'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
    'XTick',[1 2 3 4 5]);
box(axes1,'on');
hold(axes1,'all');

colormap(bone(6));
bar(memory'/1e6, 'Parent',axes1);
YLabel('Main memory (RAM) usage (in MB)');
legend('xmi', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
exportfig(gcf, 'grabatsTraverseMem.eps', 'LineStyleMap', [], 'Color', 'rgb');

%fragments
fragments = [
69680	197699	2082841	4594899	4961779;
1677	6018	5754	4063	4607;
1755	6293	25045	55699	4607;];

figure1 = figure('XVisual','');
set(figure1, 'Position', [100, 100, 450, 280]);
axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
    'YScale','log','YMinorTick','on',...
    'YMinorGrid','on',...
    'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
    'XTick',[1 2 3 4 5]);
box(axes1,'on');
hold(axes1,'all');

colormap(bone(6));
bar(fragments', 'Parent',axes1);
YLabel('Number of fragments');
legend('CDO/Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
exportfig(gcf, 'grabatsFragments.eps', 'LineStyleMap', [], 'Color', 'rgb');




