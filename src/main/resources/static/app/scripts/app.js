'use strict';

var AngularJSSpringApp = {};

angular.module('AngularJSSpringApp', ['ui.router'])
.config(function ($stateProvider, $urlRouterProvider) {
   
	
	$stateProvider
	.state('day', {
		url:	'/day', 
        templateUrl: 'app/views/day.html',
        controller: 'DayController'
    })
	.state('math', {
		url:	'/math', 
		templateUrl: 'app/views/math.html',
        controller: 'MathController'
    });
    
	$urlRouterProvider.otherwise('day');
});

