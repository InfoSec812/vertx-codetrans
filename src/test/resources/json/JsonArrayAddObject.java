package json;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.examples.annotations.CodeTranslate;
import io.vertx.examples.JsonTest;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class JsonArrayAddObject extends AbstractVerticle {

  @Override
  @CodeTranslate
  public void start() throws Exception {
    JsonTest.o = new JsonArray().add(new JsonObject().put("foo", "foo_value"));
  }
}
