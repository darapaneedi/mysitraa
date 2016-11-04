var commonModule = angular.module('common.controllers', [ 'ui.bootstrap' ]);

commonModule.controller('addDocModalCtrl', [
                 		'$scope',
                 		'$modalInstance',
                 		'$log',
                 		'successMessage',
                 		function($scope, $modalInstance, $log, successMessage) {
                 			$log.info('Inside commonModule.controller::successModalCtrl');

                 			$scope.successMessage = successMessage;
                 			
                 			$scope.cancel = function() {
                 				$log.info("Clicked Cancel Button");
                 				$modalInstance.dismiss('cancel');
                 			};
                 			
                 		} ]);