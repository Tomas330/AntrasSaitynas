<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:tns="http://spring.io/guides/gs-producing-web-service">
    <xsl:template match="/">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4" page-height="29.7cm" page-width="21cm" margin="2cm"/>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="A4">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block font-size="20pt" font-weight="bold" text-align="center">Room Details</fo:block>
                    <xsl:apply-templates select="tns:getRoomResponse/tns:room"/>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

    <xsl:template match="tns:room">
        <fo:block margin-top="20pt">
            <fo:block>Room Number: <xsl:value-of select="tns:roomNumber"/></fo:block>
            <fo:block>Room Type: <xsl:value-of select="tns:roomType"/></fo:block>
            <fo:block>Room Price: <xsl:value-of select="tns:roomPrice"/></fo:block>
        </fo:block>
    </xsl:template>
</xsl:stylesheet>
