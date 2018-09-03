


(function ($) {
    "use strict";


    /*==================================================================
    [ Focus input ]*/
    $('.inp').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() != "") {
                $(this).addClass('has-val');
            }
            else {
                $(this).removeClass('has-val');
            }
        })
    })


    /*==================================================================
    [ Validate ]*/
    var input = $('.validate-inp .inp');

    $('.validate-form').on('submit',function(){
        var check = true;

        for(var i=0; i<input.length; i++) {
            if(validate(input[i]) == false){
                showValidate(input[i]);
                check=false;
            }
        }

        var p1=$('#passMain').text();

        if(check){
          alert("Bravo!! you know how to fill a form!!");
          getValues();




      }

        return check;
    });


    $('.validate-form .inp').each(function(){
        $(this).focus(function(){
           hideValidate(this);
        });
    });

    function validate (input) {
        if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                return false;
            }
        }
        else if ($(input).attr('name')=='uname') {
              if($(input).val().trim().match(/^[a-zA-Z ]{2,30}$/)==null){
                return false;
              }
        }
        else if ($(input).attr('name')=='mobnum') {
              if($(input).val().trim().match(/^[0]?[789]\d{9}$/)==null){
                return false;
              }
        }
        else if ($(input).attr('type')=='password') {
              if($(input).val().trim().match(/^(?=.*\d)(?=.*[a-zA-Z])[a-zA-Z0-9]{7,}$/)==null){
                return false;
              }
        }

        else {
            if($(input).val().trim() == ''){
                return false;
            }
        }
    }

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
    }

    /*==================================================================
    [ Show pass ]*/
    var showPass = 0;
    $('.btn-show-pass').on('click', function(){
        if(showPass == 0) {
            $(this).next('input').attr('type','text');
            $(this).find('i').removeClass('zmdi-eye');
            $(this).find('i').addClass('zmdi-eye-off');
            showPass = 1;
        }
        else {
            $(this).next('input').attr('type','password');
            $(this).find('i').addClass('zmdi-eye');
            $(this).find('i').removeClass('zmdi-eye-off');
            showPass = 0;
        }

    });


})(jQuery);



function sendData(form) {

  // var XHR = new XMLHttpRequest();
  // alert(JSON.stringify(form));
  // // Bind the FormData object and the form element
  // //var FD = new FormData(form);
  // alert("Coming here 1");
  //
  // // Define what happens on successful data submission
  // XHR.addEventListener("load", function(event) {
  //   alert(event.target.responseText);
  // });
  //
  // // Define what happens in case of error
  // XHR.addEventListener("error", function(event) {
  //   alert('Oops! Something went wrong.');
  // });
  //
  // // Set up our request
  // XHR.open("POST", "http://192.168.43.136:8000/insertUser");
  // alert("Coming here 2");
  // // The data sent is what the user provided in the form
  // XHR.send(form);
  // alert("Coming here 3");
/*
//Fetch library
  fetch('http://192.168.43.136:8000/insertUser',{
    method:POST,
    body:form
  });

*/
alert('Coming into the function');
//JQuery - ajax

}

function getValues(){
  var uname=document.signupForm.uname.value;
  var gender=document.signupForm.gender.value;
  var mobnum=document.signupForm.mobnum.value;
  var email=document.signupForm.email.value;
  var passMain=document.signupForm.passMain.value;

  var data={"Name":uname, "Gender":gender, "MobNum":mobnum, "Email":email, "Password":passMain};

  //var form = document.getElementById("signupForm");

  //sendData(data);

  var password=passMain;
  alert(password);


  firebase.auth().createUserWithEmailAndPassword(email, password).then(function(user) {
    //var user = firebase.auth().currentUser;
    logUser(user); // Optional
}, function(error) {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
});

// function logUser(user) {
//     alert("yo");
//     alert(user);
//     var ref = firebase.database().ref("users");
//     var obj = data;
//     ref.push(obj); // or however you wish to update the node
// }
alert("yo");
firebase.database().ref('users/FZp8eQvVmNagMMqXseFPJBP4fcC3').set({
    username: uname,
    email: email,
    password : passMain
  }, function(error){
    if(error){
      alert("Write failed");
    }
    else{
      alert("Write successful");
    }
  }
);





}
