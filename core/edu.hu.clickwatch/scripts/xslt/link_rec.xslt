<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edu.hu.clickwatch.model="edu.hu.clickwatch.model">
    <xsl:strip-space  elements="*"/>
    <xsl:template match="/">
        <link_stats><xsl:apply-templates /></link_stats>
    </xsl:template>
    <xsl:template match="text()" />
    <xsl:template match="entry/link/link_info">
        <xsl:variable name="toAddr" select="../@to" /> 
        <xsl:variable name="fromAddr" select="../../@from" /> 
        <xsl:variable name="rate" select="@rate" /> 
        <xsl:variable name="size" select="@size" />
        <xsl:variable name="pdr" select="@rev" /> 
        <link_stat>
          <xsl:attribute name="time"><xsl:value-of select="../../@time"/></xsl:attribute>
          <xsl:attribute name="src">
            <xsl:value-of select="$toAddr" />
          </xsl:attribute>	        
          <xsl:attribute name="dst">
            <xsl:value-of select="$fromAddr" />
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
        </link_stat>
    </xsl:template>
</xsl:stylesheet>