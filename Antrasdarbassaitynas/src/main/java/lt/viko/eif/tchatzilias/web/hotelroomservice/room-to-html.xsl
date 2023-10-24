<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tns="http://spring.io/guides/gs-producing-web-service">
    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Room Details</title>
            </head>
            <body>
                <h1>Room Details</h1>
                <xsl:apply-templates select="tns:getRoomResponse/tns:room"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="tns:room">
        <div>
            <p>Room Number: <xsl:value-of select="tns:roomNumber"/></p>
            <p>Room Type: <xsl:value-of select="tns:roomType"/></p>
            <p>Room Price: <xsl:value-of select="tns:roomPrice"/></p>
        </div>
    </xsl:template>
</xsl:stylesheet>
