## Scala wrapper for http://ip.taobao.com/

### Usage

    scala>  import me.itang.iptaobao._
    import me.itang.iptaobao._

    scala>  ipInfo("8.8.8.8")
    res0: net.liftweb.json.JsonAST.JValue = JObject(List(JField(country,JString(美国)), JField(country_id,JString(US)), JField(area,JString()), JField(area_id,JString()), JField(region,JString()), JField(region_id,JString()), JField(city,JString()), JField(city_id,JString()), JField(county,JString()), JField(county_id,JString()), JField(isp,JString()), JField(isp_id,JString()), JField(ip,JString(8.8.8.8))))

    scala>  import net.liftweb.json._
    import net.liftweb.json._

    scala> res0 match {
    | case JObject(_) => "Good"
    | case _ => "Bad"
    | }
    res1: String = Good

    scala> ipInfo("8.8.8.8") \ "country"
    res2: net.liftweb.json.JsonAST.JValue = JString(美国)

    scala>  compact(render(res0))
    res3: String = {"country":"美国","country_id":"US","area":"","area_id":"","region":"","region_id":"","city":"","city_id":"","county":"","county_id":"","isp":"","isp_id":"","ip":"8.8.8.8"}

    scala> ipInfo("444.44")
    res4: net.liftweb.json.JsonAST.JValue = JNothing
