package net.runelite.deob.injection;

import java.io.File;
import java.io.IOException;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.deob.util.JarUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InjectTest
{
	private static final File DEOBFUSCATED = new File("C:\\Users\\Adam\\.m2\\repository\\net\\runelite\\rs\\rs-client\\1.0-SNAPSHOT\\rs-client-1.0-SNAPSHOT.jar");
	private static final File VANILLA = new File(InjectTest.class.getResource("/gamepack_v21.jar").getFile());
	private static final File OUT = new File("d:/rs/07/adamout.jar");

	private ClassGroup deob, vanilla;

	@Before
	public void before() throws IOException
	{
		deob = JarUtil.loadJar(DEOBFUSCATED);
		vanilla = JarUtil.loadJar(VANILLA);
	}

	@After
	public void after() throws IOException
	{
		JarUtil.saveJar(vanilla, OUT);
	}

	@Test
	@Ignore
	public void testRun() throws IOException, ClassNotFoundException
	{
		Inject instance = new Inject(deob, vanilla);
		instance.run();

		testLoading(vanilla);
	}

	private void testLoading(ClassGroup group) throws ClassNotFoundException
	{
		TestingClassLoader loader = new TestingClassLoader(group);
		for (ClassFile cf : group.getClasses())
		{
			loader.findClass(cf.getName());
		}
	}

}
