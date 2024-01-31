import java.util.concurrent.locks.*;

class DifferentMethodTest {
  static void lockObject(ReentrantLock t) {
    t.lock();
  }

  static void unlockObject(ReentrantLock t) {
    t.unlock();
  }

  static void test() {
    ReentrantLock testLock = new ReentrantLock();
    try {
      lockObject(testLock);
      testLock.lock();
    } finally {
      unlockObject(testLock);
    }
  }
}
