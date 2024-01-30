// a simple test case that checks that a Lock object is unlocked()
import java.util.concurrent.locks.*;

class TestDummyLockSimple {
  static void test() {
    DummyLock.ReentrantDummyLock testLock = new DummyLock.ReentrantDummyLock();
    try {
      testLock.lock();
    } finally {
      testLock.unlock();
    }
  }
}
