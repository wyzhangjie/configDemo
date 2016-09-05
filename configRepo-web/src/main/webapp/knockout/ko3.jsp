<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <title>knockout test </title>
  <script type="text/javascript" src="../js/jquery-1.10.2.min.js"></script>
  <script type="text/javascript" src="../js/knockout/knockout-3.4.0.js"></script>

</head>

<body>
<div>
  You've clicked <span data-bind="text: numberOfClicks"></span> times
  <button data-bind="click: incrementClickCounter">Click me</button>
</div>

</body>
</html>
<script type="text/javascript">

  var viewModel = {
    numberOfClicks: ko.observable(0),
    incrementClickCounter: function () {
      var previousCount =this.numberOfClicks();
      this.numberOfClicks(previousCount +1);
    }
  };
  /*绑定到ko*/
  ko.applyBindings(viewModel);

</script>