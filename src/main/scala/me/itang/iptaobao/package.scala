package me.itang

import net.liftweb.json.parse
import net.liftweb.json.JsonAST._
import scala.io.Source

package object iptaobao {

  val RestApiUrlPrefix = "http://ip.taobao.com/service/getIpInfo.php?ip="

  def ipInfo(ip: String): JValue = {
    val ret = Source.fromURL(RestApiUrlPrefix + ip, "UTF-8").mkString
    val json = parse(ret)
    json \ "code" match {
      case JInt(a) if a == 0 => json \ "data"
      case _ => JNothing
    }
  }
}
