
package playn.java;

import java.awt.image.BufferedImage;

import playn.core.Image;

/**
 * Enables the transformation of Java image bitmaps.
 */
public interface JavaBitmapTransformer extends Image.BitmapTransformer
{
  /**
   * Transforms the supplied buffered image into a new buffered image which will be used as the
   * source data for a new PlayN image. <em>Do not</em> modify the buffered image passed into this
   * method or you will break things.
   */
  BufferedImage transform(BufferedImage image);
}
