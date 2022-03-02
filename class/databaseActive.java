// message: port
import java.ext.*
import java.diap.events.message.class.*
import java.pip.message
package java.port.message
class messagePort() {
/*
@admin admin server.
*/
self.message >= message.send(self.ip:self.messageContext)
self.db => message
self.mongodb >= execute.files("mongodb:self.mongodbUrl()")
}
