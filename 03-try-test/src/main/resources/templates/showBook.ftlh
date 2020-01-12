<html xmlns="http://www.w3.org/1999/html">
<body>
<#if book??>
    book id: ${book.id}
    <br>
    book name: ${book.name}
<#else >
    book does not exist
</#if>

</body>
</html>