import java.util.concurrent.locks.*;

class SharedResource {
  private int value = 0;
  private final Lock lock = new ReentrantLock();

  public void incrementValue() {
    lock.lock();
    try {
      ++value;
    } finally {
      lock.unlock();
    }
  }

  public int getValue() {
    lock.lock();
    try {
      return value;
    } finally {
      lock.unlock();
    }
  }
}

public class SharedResourceLockTest {
  public static void test() {
    SharedResource sharedResource = new SharedResource();
    try {
      sharedResource.incrementValue();
      sharedResource.incrementValue();
    } finally {
      int result = sharedResource.getValue();
    }
  }
}
