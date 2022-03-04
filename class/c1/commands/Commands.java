package java.commands.*
import commands.list.name.*
import commands.list.name.help.*
import commands.list.name.ping.*
import commands.list.name.remove.*
import commands.list.name.add.*
import message.*
// command use / 
public class void Commands(request, require){
add.Slash.Message(request, require);
start = message.context.arch ?? message.context.low >= message.context.emoji => message.context.high <= encord(message)
}
Commands({
name:"help",
run: message.context ?? commands.help
})
