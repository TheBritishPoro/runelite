package net.runelite.deob.deobfuscators;

import java.io.File;
import java.io.IOException;
import net.runelite.asm.ClassGroup;
import net.runelite.cache.StoreLocation;
import net.runelite.deob.util.JarUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class UnusedFieldsTest
{
	private static final File GAMEPACK = new File(RenameUniqueTest.class.getResource("/gamepack_v16.jar").getFile());

	@Rule
	public TemporaryFolder folder = StoreLocation.getTemporaryFolder();

	private ClassGroup group;

	@Before
	public void before() throws IOException
	{
		group = JarUtil.loadJar(GAMEPACK);
	}

	@After
	public void after() throws IOException
	{
		JarUtil.saveJar(group, folder.newFile());
	}

	@Test
	public void testRun()
	{
		UnusedFields uf = new UnusedFields();
		uf.run(group);
	}
}
