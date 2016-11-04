<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
      <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
      <meta http-equiv="Pragma" content="no-cache" />
      <meta http-equiv="Expires" content="0" />
      <title>RubikLife Health Care</title>
      <%String contextName = application.getContextPath();%>
      <script>var contextName = "<%=contextName %>";</script>
      <link rel='stylesheet prefetch' href="<%=contextName %>/rubikLife/css/bootstrap.min.css">
      <link href="<%=contextName %>/rubikLife/css/component.css" rel="stylesheet" type="text/css">
      <link href="<%=contextName %>/rubikLife/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
      <link href="<%=contextName %>/rubikLife/css/simple-sidebar.css" rel="stylesheet">
      <!-- Optional theme -->
      <%-- <link crossorigin="anonymous" href="<%=contextName %>/rubikLife/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" rel="stylesheet"> --%>
      <script src="<%=contextName %>/rubikLife/js/jquery-1.12.4.js"></script><!-- MISSING -->
      <script src="<%=contextName %>/rubikLife/js/jquery.min.js"></script>
      <script src="<%=contextName %>/rubikLife/js/angular.min.js"></script>
      <script src="<%=contextName %>/rubikLife/js/angular-route.js"></script>
      <script type="text/javascript" src="<%=contextName %>/rubikLife/js/angular-resource.min.js"></script>
      <script type="text/javascript" src="<%=contextName %>/rubikLife/js/ui-bootstrap.js"></script>
      <script type="text/javascript" src="<%=contextName %>/rubikLife/js/ui-bootstrap-tpls-0.14.2.min.js"></script>
      <script type="text/javascript" src="https://www.google.com/jsapi"></script>
      <script src="<%=contextName %>/rubikLife/js/jquery-ui.js"></script>
      <script src="<%=contextName %>/rubikLife/js/script.js"></script>
      <script src="<%=contextName %>/rubikLife/js/index.js"></script>
      <script src="<%=contextName %>/rubikLife/js/bootstrap.min.js"></script>
      <script type="text/javascript">
		var member = '<%=request.getParameter("member")%>';

      </script>
      <!-- <link crossorigin="anonymous" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" rel="stylesheet">
         Custom CSS -->
   </head>
   <body data-ng-app="rubikLifeApp" onload="javascript:window.history.forward(1);" data-ng-contoller="jspController">
      <div class="modal-wrapper">
         <div class="modal">
            <div class="head col-md-12">
               <div class="col-md-11" id="popup-header-container">
                  <p>What do you want to do with your appointment ?</p>
               </div>
               <div class="col-md-1">
                  <a class="trigger" href="" id=
                     "closeA"><i aria-hidden="true" class=
                     "fa fa-times fa-lg"></i></a>
               </div>
            </div>
            <div class="content col-md-12">
               <div class="col-md-6 text-center">
                  <a class="col-centered action-button shadow animate teal"
                     href="#">Edit</a>
               </div>
               <div class="col-md-6 text-center">
                  <a class="col-centered action-button shadow animate red"
                     href="#" id="appointment-delete">Delete</a>
               </div>
            </div>
         </div>
      </div>
      <div class="container-fluid header-wrapper">
         <div class="col-md-3 col-xs-6 col-lg-4"><img class=
            "col-md-5 col-sm-12 col-xs-12 pull-left logo" src="<%=contextName %>/rubikLife/images/logo.png"></div>
         <div class="col-md-6 col-lg-8 clearing-padding" id="nav-and-progressbar-container">
            <!--			profile-progress-bar START-->
            <div class="col-md-4" id="progress-bar-profile-container">
               <div class="barWrapper">
                  <span class="progressText"><B>My Profile</B></span>
                  <div class="progress">
                     <div class="progress-bar" role="progressbar" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" >   
                        <span  class="popOver" data-toggle="tooltip" data-placement="top" title="75%"> </span>     
                     </div>
                  </div>
               </div>
            </div>
            <!--			profile-progress-bar ENDS-->
            <nav class="navbar navbar-default col-md-8">
               <div class="container-fluid">
                  <ul class="nav nav-pills navbar-right" id="top-ulist">
                     <li class="dropdown" role="presentation">
                        <p id="date-paragraph">
                           5/31/2016 <i aria-hidden="true" class=
                              "fa fa-sun-o"></i>
                        </p>
                     </li>
                     <li class="dropdown" role="presentation">
                        <a aria-expanded="false" aria-haspopup="true"
                           class="dropdown-toggle" data-toggle="dropdown"
                           href="#" id="profile-picture-icon" role=
                           "button"><img src=
                           "<%=contextName %>/rubikLife/images/usernamePic.png">  Mr.David
                        Cambell  <i aria-hidden="true" class=
                           "fa fa-caret-down"></i></a>
                        <ul class="dropdown-menu" id="profileDropdown">
                           <li>
                              <a href=""><i class=
                                 "fa fa-lock"></i> Edit profile</a>
                           </li>
                           <li>
                              <a href=""><i class=
                                 "fa fa-sign-out"></i> Sign-out</a>
                           </li>
                        </ul>
                     </li>
                     <li class="dropdown" role="presentation">
                        <a aria-expanded="false" aria-haspopup="true"
                           class="dropdown-toggle" data-toggle="dropdown"
                           href="#" id="envlopeAnchor" role="button">
                           <p>Messages <i aria-hidden="true" class=
                              "fa fa-envelope fa-lg"></i> <span class=
                              "button__badge">4</span></p>
                        </a>
                        <ul class="dropdown-menu" id="messagesDropdown">
                           <li><b>Emails</b></li>
                           <li>
                              <a href="">
                                 <p><i class=
                                    "fa fa-envelope"></i> Boitumelo
                                    Manala     <span class=
                                       "timeMessages">1 mins ago</span>
                                 </p>
                                 <p class="comingMessages">Hello, can we
                                    schedule a meeting today ?
                                 </p>
                              </a>
                           </li>
                           <li>
                              <a href="">
                                 <p><i class="fa fa-envelope"></i> Mark
                                    Magdy    <span class=
                                       "timeMessages">2 mins ago</span>
                                 </p>
                                 <p class="comingMessages">Hello, how are
                                    you ?
                                 </p>
                              </a>
                           </li>
                           <li>
                              <a href="">
                                 <p><i class="fa fa-envelope"></i> Ona
                                    Chedu    <span class=
                                       "timeMessages">2 days ago</span>
                                 </p>
                                 <p class="comingMessages">Hello, what's up
                                    ?
                                 </p>
                              </a>
                           </li>
                           <li>
                              <a href="">
                                 <p><i class=
                                    "fa fa-envelope"></i> Carlota   <span class="timeMessages">20
                                    mins ago</span>
                                 </p>
                                 <p class="comingMessages">Hi, Please send
                                    me the time ?
                                 </p>
                              </a>
                           </li>
                           <li>
                              <a href="">
                                 <h4><b>View all</b></h4>
                              </a>
                           </li>
                        </ul>
                     </li>
                     <li role="presentation">
                        <a href="#" id="chat-icon" onclick=
                           "popUFunction()">
                           <!--                    <i class="fa fa-comments-o fa-2x" aria-hidden="true"></i>-->
                           <p>Chat <i aria-hidden="true" class=
                              "fa fa-comments-o fa-lg faa-shake animated"></i></p>
                        </a>
                     </li>
                     <li role="presentation"></li>
                  </ul>
               </div>
            </nav>
         </div>
      </div>
       <!-- Sidebar -->
       <div class="anchorContainer" id="sidebar-wrapper">
          <div id="healthy-life-container">
             <p class="sidebar-brand" id="healthy-life-p">Related Activities</p>
          </div>
          <div id="accordion">
             <div>
                <p class="sidebar-brand">
                   <a><i aria-hidden="true" class="fa fa-heartbeat"></i> Diet &
                   Health</a>
                </p>
             </div>
             <div>
                <ul class="sidebar-nav">
                   <li><a href="#dietitionInteraction">Dietition Interaction</a></li>
                   <li><a href="#home">Report Diet Information</a></li>
                   <li><a href="#home">Suggest Food Items</a></li>
                   <li><a href="#home">Track Device</a></li>
                   <li><a href="#home">Report Medical Test</a></li>
                   <li><a href="#home">Report Medication</a></li>
                   <li><a href="#home">Complete To-Do's</a></li>
                </ul>
             </div>
             <div>
                <p class="sidebar-brand">
                   <a><i aria-hidden="true" class="fa fa-money"></i> Retail</a>
                </p>
             </div>
             <div>
                <ul class="sidebar-nav">
                   <li><a href="#">Rewards Membership</a></li>
                   <li><a href="#">Browse Grocery</a></li>
                   <li><a href="#">Push Cart to Dietitian</a></li>
                   <li><a href="#">Buy Grocery</a></li>
                   <li><a href="#">Ask a question</a></li>
                </ul>
             </div>
             <div>
                <p class="sidebar-brand">
                   <a><i aria-hidden="true" class="fa fa-line-chart"></i>
                   Incentive</a>
                </p>
             </div>
             <div>
                <ul class="sidebar-nav">
                   <li><a href="#">Report Incentive</a></li>
                   <li><a href="#">Redeem Incentive</a></li>
                </ul>
             </div>
          </div>
       </div>
       <!-- /#sidebar-wrapper -->
       <div data-ng-view></div>
      <!-- /#wrapper -->
      <!-- jQuery -->
      <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
      <script src="<%=contextName%>/rubikLife/rubikApp.js"></script>
      <script src="<%=contextName%>/rubikLife/home/service.js"></script>
      <script src="<%=contextName%>/rubikLife/home/controller.js"></script>
      <script src="<%=contextName%>/rubikLife/form/service.js"></script>
      <script src="<%=contextName%>/rubikLife/form/controller.js"></script>
      <script src="<%=contextName%>/rubikLife/common/controller.js"></script>
      <!-- <script>
         google.charts.load('current', {packages: ['corechart', 'line']});
         google.charts.setOnLoadCallback(drawBackgroundColor);
         
         function drawBackgroundColor() {
             var data = new google.visualization.DataTable();
             data.addColumn('number', 'X');
             data.addColumn('number', 'Dogs');
             data.addRows([
               [0, 0],   [1, 10],  [2, 23],  [3, 17],  [4, 18],  [5, 9],
               [6, 11],  [7, 27],  [8, 33],  [9, 40],  [10, 32], [11, 35],
               [12, 30], [13, 40], [14, 42], [15, 47], [16, 44], [17, 48],
               [18, 52], [19, 54], [20, 42], [21, 55], [22, 56], [23, 57],
               [24, 60], [25, 50], [26, 52], [27, 51], [28, 49], [29, 53],
               [30, 55], [31, 60], [32, 61], [33, 59], [34, 62], [35, 65],
               [36, 62], [37, 58], [38, 55], [39, 61], [40, 64], [41, 65],
               [42, 63], [43, 66], [44, 67], [45, 69], [46, 69], [47, 70],
               [48, 72], [49, 68], [50, 66], [51, 65], [52, 67], [53, 70],
               [54, 71], [55, 72], [56, 73], [57, 75], [58, 70], [59, 68],
               [60, 64], [61, 60], [62, 65], [63, 67], [64, 68], [65, 69],
               [66, 70], [67, 72], [68, 75], [69, 80]
             ]);
         
             var options = {
           		bar: {groupWidth: "95%"},
               	legend: { position: "none" },
           		height: 230,
         			width: 230,
              	hAxis: {
                 		title: 'Time'
               	},
               	vAxis: {
                 		title: 'Popularity'
               	},
               	backgroundColor: '#f1f8e9'
             };
         
             var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
             chart.draw(data, options);
         
         	   var chartTwo = new google.visualization.LineChart(document.getElementById('chart_div_two'));
             chartTwo.draw(data, options);
          }
      </script>
      <script type="text/javascript">
         google.charts.setOnLoadCallback(drawChart);
         function drawChart() {
           var data = google.visualization.arrayToDataTable([
             ['Task', 'Hours per Day'],
             ['Work',     11],
             ['Eat',      2],
             ['Commute',  2],
             ['Watch TV', 2],
             ['Sleep',    7]
           ]);
         
           var options = {
          chartArea:{left:10,top:0,width:"100%",height:"100%"},
          height: 300,
          width: 350,
          fontName: 'Open Sans',
          legend: { textStyle: {fontSize: 15} }
           };
         
           var chart = new google.visualization.PieChart(document.getElementById('piechart'));
           chart.draw(data, options);
         }
      </script>
      <script type="text/javascript">
         google.charts.setOnLoadCallback(drawChart);
         function drawChart() {
           var data = google.visualization.arrayToDataTable([
             ["Element", "Density", { role: "style" } ],
             ["Copper", 8.94, "#b87333"],
             ["Silver", 10.49, "silver"],
             ["Gold", 19.30, "gold"],
             ["Platinum", 21.45, "color: #e5e4e2"]
           ]);
           var view = new google.visualization.DataView(data);
           view.setColumns([0, 1,
                            { calc: "stringify",
                              sourceColumn: 1,
                              type: "string",
                              role: "annotation" },
                            2]);
         
           var options = {
          chartArea:{left:0,top:0,width:"100%",height:"100%"},
             width: 300,
             height: 300,
             bar: {groupWidth: "95%"},
             legend: { position: "none" },
           };
           var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values"));
           chart.draw(view, options);
         }
      </script>
      <script type="text/javascript">
         google.charts.setOnLoadCallback(drawChart);
         function drawChart() {
           var data = google.visualization.arrayToDataTable([
             ['Task', 'Hours per Day'],
             ['Work',     11],
             ['Eat',      2],
             ['Commute',  2],
             ['Watch TV', 2],
             ['Sleep',    7]
           ]);
         
           var options = {
             title: 'My Daily Activities',
         chartArea:{left:0,top:0,width:"100%",height:"100%"},
             is3D: true,
         width: 300,
             height: 300,
         bar: {groupWidth: "95%"},
           };
         
           var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
           chart.draw(data, options);
         }
         
      </script>
      <script type="text/javascript">
         google.charts.setOnLoadCallback(drawChart);
         function drawChart() {
           var data = google.visualization.arrayToDataTable([
             ['Task', 'Hours per Day'],
             ['Work',     11],
             ['Eat',      2],
             ['Commute',  2],
             ['Watch TV', 2],
             ['Sleep',    7]
           ]);
           var options = {
             title: 'My Daily Activities',
         chartArea:{left:0,top:0,width:"100%",height:"100%"},
             is3D: true,
         width: 300,
           	 height: 300,
         bar: {groupWidth: "95%"},
           };
           var chart = new google.visualization.PieChart(document.getElementById('piechart_3d2'));
           chart.draw(data, options);
         }
      </script>
      Menu Toggle Script
      <script>
         $("#menu-toggle").click(function(e) {
             e.preventDefault();
             $("#wrapper").toggleClass("toggled");
         });
      </script> -->
   </body>
</html>