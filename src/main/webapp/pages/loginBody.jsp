<body>

<form action="loginAction" method="post" class="form-horizontal" style="width:500px">
  <fieldset>
    <legend>Login</legend>
   
    <div class="form-group">
      <label for="email" class="col-lg-2 control-label">Email: </label>
      <div class="col-lg-10">
        <input class="form-control" id="email" name="email" placeholder="Email" type="text">
      </div>
    </div>
    
    <div class="form-group">
      <label for="password" class="col-lg-2 control-label">Password: </label>
      <div class="col-lg-10">
        <input class="form-control" id="password" name="password" placeholder="Password" type="password">
      </div>
    </div>
    
     <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-default">Cancel</button>
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </div>
    
  
  </fieldset>
</form>

</body>