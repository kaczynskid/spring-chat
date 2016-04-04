var app = angular.module('SpringChat', ['AngularStomp']);

app.controller('ChatCtrl', function($scope, ngstomp) {

    $scope.messages = [];

    $scope.client = ngstomp('/chat');
    $scope.client.connect('', '', function() {
        $scope.client.subscribe('/topic/chat', function(message) {
            $scope.messages.push(JSON.parse(message.body));
        });
    });

    $scope.msg = {};
    $scope.msg.sender = '';
    $scope.msg.content = '';

    $scope.sendMsg = function() {
        if (this.msg.sender && this.msg.content) {
            this.client.send('/app/chat', {}, JSON.stringify(this.msg));
            this.msg.content = '';
        }
    };

})
