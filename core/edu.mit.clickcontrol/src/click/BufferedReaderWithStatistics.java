package click;

import java.io.BufferedReader;
import java.io.FilterReader;
import java.io.IOException;

public class BufferedReaderWithStatistics extends FilterReader {
	
	private long readBytes = 0;

	public BufferedReaderWithStatistics(BufferedReader in) {
		super(in);
	}
	
	public String readLine() throws IOException {
		return ((BufferedReader)in).readLine();
	}

	@Override
	public int read() throws IOException {
		int bytes = super.read();
		readBytes += bytes;
		return bytes;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		int bytes = super.read(cbuf, off, len);
		readBytes += bytes;
		return bytes;
	}
	
	public void resetStatistics() {
		readBytes = 0;
	}

	public long getReadBytes() {
		return readBytes;
	}
}
