function query() {

//    var userId = document.getElementById('userId').value;
    var userId = $("#userId").val();
    if (userId=== ""){
        alert("必填");
    } else {
        $.ajax({
            type:"GET",
            url: "/user/search?id=" + userId,
            cache: false,
            async: false,
            success: function(data) {
                alert(data.userName);
            }
        })
    }


}