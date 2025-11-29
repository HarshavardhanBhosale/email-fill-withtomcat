<html>
  <body>
    <h2>Contact Us</h2>
    <form method="post" action="contact">
      <p>Name: <input type="text" name="name"/></p>
      <p>Email: <input type="text" name="email"/></p>
      <p>Message: <textarea name="message"></textarea></p>
      <button type="submit">Submit</button>
    </form>

    <p style="color:red">${error}</p>
  </body>
</html>