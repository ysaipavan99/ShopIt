/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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
        else if(($(input).attr('name')=='passMain') != ($(input).attr('name')=='passConfirm') ){
            return false;
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



function getValues(){
  var uname=document.signupForm.uname.value;
  var gender=document.signupForm.gender.value;
  var mobnum=document.signupForm.mobnum.value;
  var email=document.signupForm.mobnum.value;
  var passMain=document.signupForm.passMain.value;

  var form = document.getElementById("signupForm");



}
