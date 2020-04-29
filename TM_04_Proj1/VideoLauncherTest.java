package Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoLauncherTest {

	@Test
	public void test() {
		VideoStore store=new VideoStore(4);
		store.addVideo("Robot");
		store.addVideo("Avengers");
		store.addVideo("Zinda");
		store.addVideo("Captain America");
		assertEquals(0,store.indexFind("Robot"));
		assertEquals(1,store.indexFind("Avengers"));
		assertEquals(2,store.indexFind("Zinda"));
		assertEquals(3,store.indexFind("Captain America"));
		assertEquals(-1,store.indexFind("Iron Man"));
	}

}
