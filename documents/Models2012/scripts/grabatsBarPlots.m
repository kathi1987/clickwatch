close all;
clear all;

% query_time = [
%     2133.4	3766.6	27116.4	141062.7 242597.0; 
%     18703.9	46835.1	115795.2 280000 320000; 
%     2944.8	3277.8	16466.2 42000 45500;
%     14225.9	34448.4	92144.2	247047.0 272939.3;
%     1345.9	2444.7	15586.0	39963.4	43238.2;    
%     4131.7	11333.9	27710.1	51155.5	55614.5;
%     4058.7	10872.5	17210.8	30291.3	54858.9];
% 
% figure1 = figure('XVisual','');
% set(figure1, 'Position', [100, 100, 450, 450*3/4]);
% axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
%     'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
%     'XTick',[1 2 3 4 5]);
% box(axes1,'on');
% hold(axes1,'all');
% 
% colormap(bone(7));
% bar(query_time'/1e3, 'Parent',axes1);
% YLabel('Execution time (in s)');
% legend('XMI', 'CDO w/o SQL', 'CDO', 'Morsa w/o index', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
% exportfig(gcf, 'grabatsQueryTime.eps', 'LineStyleMap', [], 'Color', 'rgb');  
% 
% % traverse
% load_time = [ 1818	3541	27446	140410	241136;
%     18855	47686	457979	1000000 1150000;
%     17709	44074	421562	964655	1048259;
%     3833	11239	33478	62606	68730;
%     3892	10350	46972	99230	68146;];
% 
% figure1 = figure('XVisual','');
% set(figure1, 'Position', [100, 100, 450, 450*3/4]);
% axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
%     'YMinorTick','on',...
%     'YMinorGrid','on',...
%     'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
%     'XTick',[1 2 3 4 5]);
% box(axes1,'on');
% hold(axes1,'all');
% 
% colormap(bone(6));
% bar(load_time'/1e3, 'Parent',axes1);
% YLabel('Execution time (in s)');
% legend('XMI', 'CDO', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
% exportfig(gcf, 'grabatsTraverseTime.eps', 'LineStyleMap', [], 'Color', 'rgb');
% 
% %traverse objects per second
% objectsPerSecond = [38448.3	56075.6	75908.8	32742.9	20579.6;
% 3697.4	4146.4	4549.0	4350 4320;	
% 3995.7	4539.9	4951.4	4766.6	4737.7;
% 18230.1	17671.3	62234.1	72700.9	72203.6;
% 17935.4	19111.9	44370.8	46313.3	72816.9];
% 
% figure1 = figure('XVisual','');
% set(figure1, 'Position', [100, 100, 450, 450*3/4]);
% axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
%     'YMinorTick','on',...
%     'YMinorGrid','on',...
%     'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
%     'XTick',[1 2 3 4 5]);
% ylim(axes1,[0 8.6e4]);
% box(axes1,'on');
% hold(axes1,'all');
% 
% colormap(bone(6));
% bar(objectsPerSecond', 'Parent',axes1);
% YLabel('Objects per second (\times 10^4)');
% legend('XMI', 'CDO', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
% exportfig(gcf, 'grabatsTraverseObjectsPerSecond.eps', 'LineStyleMap', [], 'Color', 'rgb');

%memory
% memory = [ 34741397	99251404	745807894	1638047055	1765494183;
% 3282200	3268081	3842562	3994814	4122279;
% 4364742	6293135	6048543	5384703	5655025;
% 4323533	6251802	6065440	5403960	5649159;];
% 
% figure1 = figure('XVisual','');
% set(figure1, 'Position', [100, 100, 450, 200]);
% axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
%     'YScale','log','YMinorTick','on',...
%     'YMinorGrid','on',...
%     'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
%     'XTick',[1 2 3 4 5]);
% box(axes1,'on');
% hold(axes1,'all');
% 
% colormap(bone(6));
% bar(memory'/1e6, 'Parent',axes1);
% YLabel('Main memory (RAM) usage (in MByte)');
% legend('XMI', 'Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
% exportfig(gcf, 'grabatsTraverseMem.eps', 'LineStyleMap', [], 'Color', 'rgb');
% 
% %fragments
% fragments = [
% 69680	197699	2082841	4594899	4961779;
% 1677	6018	5754	4063	4607;
% 1755	6293	25045	55699	4607;];
% 
% figure1 = figure('XVisual','');
% set(figure1, 'Position', [100, 100, 450, 200]);
% axes1 = axes('Parent',figure1,'ZGrid','on','YGrid','on',...
%     'YScale','log','YMinorTick','on',...
%     'YMinorGrid','on',...
%     'XTickLabel',['set0';'set1';'set2';'set3';'set4'],...
%     'XTick',[1 2 3 4 5]);
% ylim(axes1,[1e3 1e7]);
% box(axes1,'on');
% hold(axes1,'all');
% 
% colormap(bone(6));
% bar(fragments', 'Parent',axes1);
% YLabel('Number of fragments');
% legend('CDO/Morsa', 'EMFFrag coarse', 'EMFFrag fine', 'Location', 'NorthWest');
% exportfig(gcf, 'grabatsFragments.eps', 'LineStyleMap', [], 'Color', 'rgb');

%create objects per second
objectsPerSecond = [59243.8 116460.4;
    3418.3 3505.7;
    1186.0 1272.0;
    45017.3 46610.2];

figure2 = figure('XVisual','');
set(figure2, 'Position', [100, 100, 450, 200]);
axes1 = axes('Parent',figure2,'ZGrid','on','YGrid','on',...
    'YScale', 'log','YMinorTick','on',...
    'YMinorGrid','on',...
    'XTickLabel',{'XMI';'CDO';'Morsa';'EMFFrag'},...
    'XTick',[1 2 3 4 5 6]);
ylim(axes1,[1e3 2e5]);
box(axes1,'on');
hold(axes1,'all');

colormap(bone(2));
bar(objectsPerSecond, 'Parent',axes1);
YLabel('Objects per second (\times 10^4)');
legend('w/ cross references', 'w/o cross references');
exportfig(gcf, 'createObjectsPerSecond.eps', 'LineStyleMap', [], 'Color', 'rgb');

%EMF frag create objects per second
objectsPerSecond = [
    191.8 1554.2;
    1221.0 3182.7;
    8895.8 9532.6;
    3137.9 10224.1;
    31671.1 38050.9;
    45017.3 46610.2;
    39947.8 39462.0]';
fragmentations = [1 3 10 30 100 1000 10000];

figure2 = figure('XVisual','');
set(figure2, 'Position', [100, 100, 450, 200]);
loglog(fragmentations, objectsPerSecond(1,:),'-^', fragmentations, objectsPerSecond(2,:), '-o');

YLabel('Objects per second');
XLabel('Fragment size');
legend('w/ cross references', 'w/o cross references','Location', 'SouthEast');
exportfig(gcf, 'createObjectsFragPerSecond.eps', 'LineStyleMap', [], 'Color', 'rgb');



