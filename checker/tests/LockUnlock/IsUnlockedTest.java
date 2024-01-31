// a simple test case that checks that a Lock object is unlocked()
import java.util.concurrent.locks.*;

class IsUnlockedTest {
  static void test() {
    ReentrantLock testLock = new ReentrantLock();
    try {
      testLock.lock();
    } finally {
      testLock.unlock();
    }
  }
}
