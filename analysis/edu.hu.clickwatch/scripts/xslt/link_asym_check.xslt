<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edu.hu.clickwatch.model="edu.hu.clickwatch.model">
    <xsl:strip-space  elements="*"/>
    <xsl:template match="/">
        <link_stats><xsl:apply-templates /></link_stats>
    </xsl:template>
    <xsl:template match="text()" />
    <xsl:template match="children[@name='link_stat']/handler[@name='bcast_stats']/entry/link/link_info">
        <xsl:variable name="toAddr" select="../@to" /> 
        <xsl:variable name="fromAddr" select="../../@from" /> 
        <xsl:variable name="rate" select="@rate" /> 
        <xsl:variable name="size" select="@size" />
        <xsl:variable name="fromIP" select="../../../../../../@iNetAdress" />
        <xsl:variable name="pdr" select="@rev" /> 
        <xsl:variable name="revlinkinfo" select="//children[@name='link_stat']/handler[@name='bcast_stats']/entry[@from=$toAddr]/link[@to=$fromAddr]/link_info[@rate=$rate and @size=$size]" /> 
        <link_stat>
          <xsl:attribute name="src">
            <xsl:value-of select="$toAddr" />
          </xsl:attribute>	        
          <xsl:attribute name="dst">
            <xsl:value-of select="$fromAddr" />
          </xsl:attribute>	        
          <xsl:attribute name="srcIP">
            <xsl:value-of select="$revlinkinfo/../../../../../../@iNetAdress" />
          </xsl:attribute>	        
          <xsl:attribute name="dstIP">
            <xsl:value-of select="$fromIP" />
          </xsl:attribute>	        
          <xsl:attribute name="bitRate">
            <xsl:value-of select="$rate" />
          </xsl:attribute>	        
          <xsl:attribute name="packetSize">
            <xsl:value-of select="$size" />
          </xsl:attribute>	        
          <xsl:attribute name="pdr">
            <xsl:value-of select="$pdr" />
          </xsl:attribute>	        
          <xsl:attribute name="revpdr">
            <xsl:value-of select="$revlinkinfo/@rev" />
          </xsl:attribute>	        
          <xsl:attribute name="rssi">
            <xsl:value-of select="//children[@name='cst']/handler[@name='stats_xml']/channelstats[@node=$fromAddr]/rssi/nb[@addr=$toAddr]/@rssi" />
          </xsl:attribute>	        
          <xsl:attribute name="revrssi">
            <xsl:value-of select="//children[@name='cst']/handler[@name='stats_xml']/channelstats[@node=$toAddr]/rssi/nb[@addr=$fromAddr]/@rssi" />
          </xsl:attribute>	        
          <xsl:attribute name="src_hwbusy">
            <xsl:value-of select="//children[@name='cst']/handler[@name='stats_xml']/channelstats[@node=$toAddr]/phy/@hwbusy" />
          </xsl:attribute>	        
          <xsl:attribute name="dst_hwbusy">
            <xsl:value-of select="//children[@name='cst']/handler[@name='stats_xml']/channelstats[@node=$fromAddr]/phy/@hwbusy" />
          </xsl:attribute>	        
          <xsl:attribute name="src_noise">
            <xsl:value-of select="//children[@name='cst']/handler[@name='stats_xml']/channelstats[@node=$toAddr]/phy/@avg_noise" />
          </xsl:attribute>	        
          <xsl:attribute name="dst_noise">
            <xsl:value-of select="//children[@name='cst']/handler[@name='stats_xml']/channelstats[@node=$fromAddr]/phy/@avg_noise" />
          </xsl:attribute>	        
        </link_stat>
    </xsl:template>
</xsl:stylesheet>