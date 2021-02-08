package modelsHW;

import jdk.jshell.Snippet;

public class PetHW {
    private long id;
    private String name;
    private String[]photoUrls;
    private Snippet.Status status;
    private CategoryHW categoryHW;
    private TagHW[] tags;

    public PetHW(String name, String[] photoUrls) {
        this.name = name;
        this.photoUrls = photoUrls;
    }

    public long getId() {
        return id;
    }

    public Snippet.Status getStatus() {
        return status;
    }

    public CategoryHW getCategoryHW() {
        return categoryHW;
    }

    public TagHW[] getTags() {
        return tags;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(Snippet.Status status) {
        this.status = status;
    }

    public void setCategoryHW(CategoryHW categoryHW) {
        this.categoryHW = categoryHW;
    }

    public void setTags(TagHW[] tags) {
        this.tags = tags;
    }
}
