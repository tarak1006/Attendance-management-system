$(function() {
                $('#subject').hide(); 
                $('#subject2').hide();
                $('#type').change(function(){
                    if($('#type').val() == 'op1') {
                        $('#subject').show(); 
                        $('#subject2').hide();

                    } else if($('#type').val() == 'op2'){
                        $('#subject').show(); 
                        $('#subject2').show();
                    } 
                    else{
                        $('#subject').hide(); 
                        $('#subject2').hide();
                    }
                });
            });
$(function() {
                $('#price1').hide(); 
                $('#price2').hide();
                $('#subtype').change(function(){
                    if($('#subtype').val() == 'theory') {
                        $('#price1').show(); 
                        $('#price2').hide();

                    } else if($('#subtype').val() == 'lab'){
                        $('#price2').show(); 
                        $('#price1').hide();
                    } 
                    else{
                        $('#price1').hide(); 
                        $('#price2').hide();
                    }
                });
            });
$(function() {
                $('#price3').hide(); 
                $('#price4').hide();
                $('#subtype1').change(function(){
                    if($('#subtype1').val() == 'theory') {
                        $('#price3').show(); 
                        $('#price4').hide();

                    } else if($('#subtype1').val() == 'lab'){
                        $('#price4').show(); 
                        $('#price3').hide();
                    } 
                    else{
                        $('#price3').hide(); 
                        $('#price4').hide();
                    }
                });
            });
$(function() {
                $('#cashdiv').hide(); 
                $('#otherdiv').hide();
                $('#paytype').change(function(){
                    if($('#paytype').val() == 'cash') {
                        $('#cashdiv').show(); 
                        $('#otherdiv').hide();

                    } else if($('#paytype').val() == 'other'){
                        $('#otherdiv').show(); 
                        $('#cashdiv').hide();
                    } 
                    else{
                        $('#cashdiv').hide(); 
                        $('#otherdiv').hide();
                    }
                });
            });
//For form validations...
