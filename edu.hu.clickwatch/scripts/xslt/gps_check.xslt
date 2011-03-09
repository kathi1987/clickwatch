<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edu.hu.clickwatch.model="edu.hu.clickwatch.model">
	<xsl:strip-space elements="*"/>
	<xsl:template match="/">
		<gps_stats>
			<xsl:apply-templates/>
		</gps_stats>
	</xsl:template>
	<xsl:template match="text()"/>
	<xsl:template match="handler[@name='channelstatinfo']">
			<xsl:variable name="nodeid" select="../../element[@name='id']/handler[@name='devinfo']/nodeidentity/device/@address"/>
			<gps_stat>
     			<xsl:attribute name="id"><xsl:value-of select="$nodeid"/></xsl:attribute>
				<xsl:attribute name="long"><xsl:value-of select="node/gps/@long"/></xsl:attribute>
				<xsl:attribute name="lat"><xsl:value-of select="node/gps/@lat"/></xsl:attribute>
				<xsl:attribute name="alt"><xsl:value-of select="node/gps/@alt"/></xsl:attribute>
			</gps_stat>
	</xsl:template>
</xsl:stylesheet>

