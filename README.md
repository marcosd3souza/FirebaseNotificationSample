# FirebaseNotificationSample
Projeto de exemplo mostrando o uso do FCM (Firebase Cloud Message)

Para realizar um push notification através do postman é preciso realizar o seguinte request:


POST /fcm/send HTTP/1.1
Host: fcm.googleapis.com
Authorization: key=AAAAGvCDgmI:APA91bEds50PdWQr7_I2HuyhdBAuV4phVOrF9Hm5eei5915qfuMVdIR_w3okDZmWuWJeyYGJUb58g9LFkeTwIKBbtZVYS3EdEc7am1N0yNBZwKUt2fOM-a25bvCtRBjoGIsaeH48ardU
Content-Type: application/json

{ 
 "to": "elXN2IN0jCQ:APA91bHNbDOGuLLQeFx2ngqPCxFXfhCQbHIm9oAfuYy9ASL3atW9E4nndOcRFB2Bx2g0ztdL_d7aO2BnjUNdtbKtBl3iwIYFPwuZv26BEq97KxZ-2xWq7Pq1XR9-Y9GQPWvArmQodlBQ",
 "notification" : {
 "sound":"default",
 "body" : "great match!",
 "content_available" : true,
 "priority" : "high",
 "title" : "new message"
 },
 "data" : {
 "body" : "great match!",
 "content_available" : true,
 "priority" : "high",
 "title" : "Portugal vs. Denmark"
 }
}
