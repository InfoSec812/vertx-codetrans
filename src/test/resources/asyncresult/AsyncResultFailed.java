package asyncresult;

import io.vertx.core.AbstractVerticle;
import io.vertx.examples.AsyncResultTest;
import io.vertx.examples.annotations.CodeTranslate;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class AsyncResultFailed extends AbstractVerticle {

  @Override
  @CodeTranslate
  public void start() throws Exception {
    AsyncResultTest.callbackWithFailure(res -> {
      AsyncResultTest.setCause(res.cause(), res.failed());
    });
  }
}
