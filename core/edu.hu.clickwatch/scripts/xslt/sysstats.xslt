<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edu.hu.clickwatch.model="edu.hu.clickwatch.model">
    <xsl:strip-space  elements="*"/>
    <xsl:template match="/">
        <sys_stats><xsl:apply-templates /></sys_stats>
    </xsl:template>
    <xsl:template match="text()" />
    <xsl:template match="system/loadavg">
        <xsl:variable name="nodeid" select="../../../../element[@name='id']/handler[@name='devinfo']/nodeidentity/device/@address"/>
        <sys_stat>
          <xsl:attribute name="id">
            <xsl:value-of select="$nodeid" />
          </xsl:attribute>	        
          <xsl:attribute name="onemin">
            <xsl:value-of select="@onemin" />
          </xsl:attribute>	        
          <xsl:attribute name="fivemin">
            <xsl:value-of select="@fivemin" />
          </xsl:attribute>	        
          <xsl:attribute name="fifteen">
            <xsl:value-of select="@fifteen" />
          </xsl:attribute>	        
        </sys_stat>
    </xsl:template>
</xsl:stylesheet>