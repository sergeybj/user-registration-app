<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head><title>First JSP</title>

  <script>
  $(function() {
    $( "#birthDate" ).datepicker({ dateFormat: 'yy-mm-dd' });
  });
  </script>

</head>
<body>

<s:form action="registerUserAction" method="post" class="form-horizontal" style="width:500px" validate="true">
  <fieldset>
    <legend>User Registration Form</legend>
    
    <div class="form-group">
      <label for="firstName" class="col-lg-2 control-label">First Name: </label>
      <div class="col-lg-10">
        <s:textfield class="form-control" id="firstName" name="firstName" placeholder="First Name"/>
      </div>
    </div>
    
    <div class="form-group">
      <label for="lastName" class="col-lg-2 control-label">Last Name: </label>
      <div class="col-lg-10">
        <s:textfield class="form-control" id="lastName" name="lastName" placeholder="Last Name"/>
      </div>
    </div>
    
    <div class="form-group">
      <label for="email" class="col-lg-2 control-label">Email: </label>
      <div class="col-lg-10">
        <s:textfield class="form-control" id="email" name="email" placeholder="Email"/>
      </div>
    </div>
    
    <div class="form-group">
      <label for="password" class="col-lg-2 control-label">Password: </label>
      <div class="col-lg-10">
        <s:password class="form-control" id="password" name="password" placeholder="Password"/>
      </div>
    </div>
    
     <div class="form-group">
      <label for="birthDate" class="col-lg-2 control-label">Birth Date: </label>
      <div class="col-lg-10">
        <s:textfield class="form-control" id="birthDate" name="birthDate" placeholder="Birth Date"/>
      </div>
    </div>
    
     <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-default">Cancel</button>
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </div>
    
  
  </fieldset>
</s:form>

</body>
</html>
