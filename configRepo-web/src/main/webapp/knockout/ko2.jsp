<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <title>knockout test </title>
  <script type="text/javascript" src="../js/jquery-1.10.2.min.js"></script>
  <script type="text/javascript" src="../js/knockout/knockout-3.4.0.js"></script>
  <style type="text/css">
    body { font-family: arial; font-size: 14px; }

    .liveExample { padding: 1em; background-color: #EEEEDD; border: 1px solid #CCC; max-width: 655px; }
    .liveExample input { font-family: Arial; }
    .liveExample b { font-weight: bold; }
    .liveExample p { margin-top: 0.9em; margin-bottom: 0.9em; }
    .liveExample select[multiple] { width: 100%; height: 8em; }
    .liveExample h2 { margin-top: 0.4em; font-weight: bold; font-size: 1.2em; }

    .liveExample th { text-align: left; font-weight: bold; }
    .liveExample .price { text-align: right; padding-right: 2em; }
    .liveExample .grandTotal { border-top: 1px solid silver; padding-top: 0.5em; font-size: 1.2em; }
    .liveExample .grandTotal SPAN { font-weight: bold; }

    .liveExample table, .liveExample td, .liveExample th { padding: 0.2em; border-width: 0; margin: 0; vertical-align: top; }
    .liveExample td input, .liveExample td select { width: 8em; }
    .liveExample td.quantity input { width: 4em; }
    .liveExample td select { height: 1.8em; white-space: nowrap; }


    li { list-style-type: disc; margin-left: 20px; }

  </style>
</head>

<body>
The item is <span data-bind="text: priceRating"></span> today.
</body>
</html>
<script type="text/javascript">

  var viewModel ={
    price: ko.observable(24.95)
  }
  viewModel.priceRating = ko.dependentObservable(function(){
    return this.price() >50?"expensive" : "affordable";
  },viewModel);
  /*绑定到ko*/
  ko.applyBindings(viewModel);

</script>