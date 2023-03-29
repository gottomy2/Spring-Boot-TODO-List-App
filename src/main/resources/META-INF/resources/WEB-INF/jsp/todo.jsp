<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">

    <h1>Enter Todo Details</h1>

    <form:form cssClass="" class="" method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input class="d-inline p-2" type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input class="d-inline p-2" type="text" path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        <c:if test="${showDone}">
            <fieldset class="mb-3">
                <form:label path="done">Is done?</form:label>
                <form:checkbox class="form-check-input m-2" path="done"/>
            </fieldset>
        </c:if>

        <form:input type="hidden" path="id"/>
        <input type="submit" class="btn btn-success"/>

    </form:form>

    <script>

    </script>

</div>
</body>
<%@ include file="common/footer.jspf" %>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>