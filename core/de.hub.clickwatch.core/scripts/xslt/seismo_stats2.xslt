<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edu.hu.clickwatch.model="edu.hu.clickwatch.model">
	<xsl:strip-space elements="*"/>
	<xsl:template match="/">
		<seismo_stats>
			<xsl:apply-templates/>
		</seismo_stats>
	</xsl:template>
	<xsl:template match="text()"/>
	<xsl:template match="node/seismo/chaninfo">
			<seismo_stat>
				<xsl:attribute name="time"><xsl:value-of select="../../@time"/></xsl:attribute>
				<xsl:attribute name="chanId"><xsl:value-of select="@id"/></xsl:attribute>
				<xsl:attribute name="avgval"><xsl:value-of select="@avg_value"/></xsl:attribute>
			</seismo_stat>
	</xsl:template>
</xsl:stylesheet>

