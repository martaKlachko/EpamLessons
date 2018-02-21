<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
        <html>
            <head>
                <style type="text/css">
                    table.tfmt {
                    border: 1px ;
                    }

                    td.colfmt {
                    border: 1px ;
                    background-color: yellow;
                    color: red;
                    text-align:right;
                    }

                    th {
                    background-color: #2E9AFE;
                    color: white;
                    }

                </style>
            </head>

            <body>
                <table >
                    <tr>
                        <th style="width:250px">name</th>
                        <th style="width:350px">soil</th>
                        <th style="width:250px">origin</th>
                        <th style="width:250px">multiplying</th>
                    </tr>

                    <xsl:for-each select="flowers/flower">

                        <tr>

                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="soil"/></td>
                            <td><xsl:value-of select="origin"/></td>
                            <td><xsl:value-of select="multiplying"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>