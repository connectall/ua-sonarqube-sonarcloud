import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.go2group.connectall.config.model.bean.FieldValue
import com.go2group.connectall.config.model.bean.Name

Logger logger = LogManager.getLogger("com.go2group.connectall.model.transformer.model.api.set-sonar-description");

logger.info("~~~Generating Description from Sonar~~~")

def textRange = message.payload.getSingleValueField("textRange");
def component = message.payload.getSingleValueField("component");
def tempMessage = message.payload.getSingleValueField("message");

//def newDesc = "code lines:" + textRange + "\n\ncomponent:\n" + component + "\n\nmessage:\n" + tempMessage;
def newDesc = "Sonar reported an issue on component *" + component + "*" + "\n\n*Location*\n" + textRange + "\n\n*Message*\n" + tempMessage;
logger.info("newDesc is: " + newDesc);

message.payload.setSingleValueField("message",newDesc);

return message.payload