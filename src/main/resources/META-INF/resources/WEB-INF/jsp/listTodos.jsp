<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>Your Todos</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is Done?</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>
                    <input class="form-check-input m-2" type="checkbox" disabled="disabled" name="done" value="${todo.done}"
                           <c:if test="${todo.done}">checked</c:if>
                    >
                </td>
                <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
</body>
<%@ include file="common/footer.jspf" %>