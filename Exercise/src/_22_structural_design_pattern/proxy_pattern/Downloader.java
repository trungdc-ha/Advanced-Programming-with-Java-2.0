package _22_structural_design_pattern.proxy_pattern;

public interface Downloader {
    void download(String userAgent, String url, String dest);
}
