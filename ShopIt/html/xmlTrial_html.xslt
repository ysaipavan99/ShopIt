<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="UTF-8"/>
<xsl:template match="/">
<html>
  <body>
    <h1>Trial of retrieving data from XML</h1>
    <table border="2">
      <tr bgcolor="#9acd32">
        <th>Title</th>
        <th>Price</th>
      </tr>
      <xsl:for-each select="productList/product">
        <tr>
          <td><xsl:value-of select="title"/></td>
          <td><xsl:value-of select="cost"/></td>
        </tr>
      </xsl:for-each>
    </table>
  </body>
</html>
</xsl:template>
</xsl:stylesheet>
