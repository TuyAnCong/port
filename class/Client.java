package java.pip.client
import java.ext.*
import java.message.client.*
class SendClientViaLink(){
  /*
SendClientViaLink Class Icon Share
*/
start = shareLinkWithAction('portChat.message/share/${uid_group}') 
end = sayInPortChatSystem('Successfully Sended')
shareIcon = raw('share.pngfree.com/image.png')
}
class sendPhoto(){
end = sendPhotoRaw
raw = sendMSG(end)
}
class Event(event){
events_list = ["Create", "Delete", "Read Message", "etc_meta"]
event = addEvent.permssion(["CREATE", "DELETE", "READ_MESSAGE"])
errorEvent = system.PrintOut("Error Events! ERROR_ADD_EVENT_META")
}
class sendGIF(gif_name){
// class action send GIF Button
exec.file('sendGIF.php')
data.saveMemory()
}
