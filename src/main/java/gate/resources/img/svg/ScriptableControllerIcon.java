package gate.resources.img.svg;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class has been automatically generated using <a
 * href="http://englishjavadrinker.blogspot.com/search/label/SVGRoundTrip">SVGRoundTrip</a>.
 */
@SuppressWarnings("unused")
public class ScriptableControllerIcon implements
		javax.swing.Icon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Area clip = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    Shape clip_ = g.getClip();
AffineTransform defaultTransform_ = g.getTransform();
//  is CompositeGraphicsNode
float alpha__0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0 = g.getClip();
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
clip = new Area(g.getClip());
clip.intersect(new Area(new Rectangle2D.Double(0.0,0.0,64.0,64.0)));
g.setClip(clip);
// _0 is CompositeGraphicsNode
float alpha__0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0 = g.getClip();
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0 is CompositeGraphicsNode
float alpha__0_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(0.5379909873008728f, 0.0f, 0.0f, 0.530135989189148f, 17.2419490814209f, 12.596540451049805f));
// _0_0_0 is CompositeGraphicsNode
float alpha__0_0_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0 is ShapeNode
paint = new Color(255, 97, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.042755, -19.365057);
((GeneralPath)shape).curveTo(-7.8215437, -17.997686, 9.529157, -10.300208, -0.89474475, -4.615057);
((GeneralPath)shape).curveTo(-11.318646, 1.0700942, -8.966936, -17.377476, -16.363495, -8.240057);
((GeneralPath)shape).curveTo(-23.760054, 0.8973612, -5.9015875, -5.6261516, -9.144745, 5.572443);
((GeneralPath)shape).curveTo(-12.387902, 16.771038, -24.11123, 2.111303, -22.707245, 13.666193);
((GeneralPath)shape).curveTo(-21.303259, 25.221083, -13.419629, 8.326636, -7.582245, 18.478693);
((GeneralPath)shape).curveTo(-1.7448606, 28.630749, -20.683088, 26.36878, -11.300995, 33.57244);
((GeneralPath)shape).curveTo(-1.9189007, 40.776108, -8.58071, 23.351362, 2.9177554, 26.509943);
((GeneralPath)shape).curveTo(14.41622, 29.668522, -0.63404477, 41.096066, 11.230255, 39.72869);
((GeneralPath)shape).curveTo(23.094555, 38.36132, 5.7126045, 30.663845, 16.136505, 24.978693);
((GeneralPath)shape).curveTo(26.560406, 19.293543, 24.239948, 37.741108, 31.636505, 28.603693);
((GeneralPath)shape).curveTo(39.033062, 19.466274, 21.143349, 25.98979, 24.386505, 14.791193);
((GeneralPath)shape).curveTo(27.629662, 3.5925972, 39.38424, 18.252333, 37.980255, 6.697443);
((GeneralPath)shape).curveTo(36.576267, -4.8574457, 28.66139, 12.036998, 22.824005, 1.8849432);
((GeneralPath)shape).curveTo(16.986622, -8.267112, 35.924847, -5.9738936, 26.542755, -13.177557);
((GeneralPath)shape).curveTo(17.160662, -20.38122, 23.85372, -2.9877279, 12.355255, -6.146307);
((GeneralPath)shape).curveTo(0.85679024, -9.304885, 15.907053, -20.732428, 4.042755, -19.365057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.7927556, -1.1150568);
((GeneralPath)shape).curveTo(13.463302, -1.1150568, 18.074005, 3.769375, 18.074005, 9.791193);
((GeneralPath)shape).curveTo(18.074005, 15.81301, 13.4633, 20.697443, 7.7927556, 20.697443);
((GeneralPath)shape).curveTo(2.1222112, 20.697443, -2.4884946, 15.813011, -2.4884946, 9.791193);
((GeneralPath)shape).curveTo(-2.4884946, 3.7693741, 2.1222103, -1.1150568, 7.7927556, -1.1150568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.013f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.042755, -19.365057);
((GeneralPath)shape).curveTo(-7.8215437, -17.997686, 9.529157, -10.300208, -0.89474475, -4.615057);
((GeneralPath)shape).curveTo(-11.318646, 1.0700942, -8.966936, -17.377476, -16.363495, -8.240057);
((GeneralPath)shape).curveTo(-23.760054, 0.8973612, -5.9015875, -5.6261516, -9.144745, 5.572443);
((GeneralPath)shape).curveTo(-12.387902, 16.771038, -24.11123, 2.111303, -22.707245, 13.666193);
((GeneralPath)shape).curveTo(-21.303259, 25.221083, -13.419629, 8.326636, -7.582245, 18.478693);
((GeneralPath)shape).curveTo(-1.7448606, 28.630749, -20.683088, 26.36878, -11.300995, 33.57244);
((GeneralPath)shape).curveTo(-1.9189007, 40.776108, -8.58071, 23.351362, 2.9177554, 26.509943);
((GeneralPath)shape).curveTo(14.41622, 29.668522, -0.63404477, 41.096066, 11.230255, 39.72869);
((GeneralPath)shape).curveTo(23.094555, 38.36132, 5.7126045, 30.663845, 16.136505, 24.978693);
((GeneralPath)shape).curveTo(26.560406, 19.293543, 24.239948, 37.741108, 31.636505, 28.603693);
((GeneralPath)shape).curveTo(39.033062, 19.466274, 21.143349, 25.98979, 24.386505, 14.791193);
((GeneralPath)shape).curveTo(27.629662, 3.5925972, 39.38424, 18.252333, 37.980255, 6.697443);
((GeneralPath)shape).curveTo(36.576267, -4.8574457, 28.66139, 12.036998, 22.824005, 1.8849432);
((GeneralPath)shape).curveTo(16.986622, -8.267112, 35.924847, -5.9738936, 26.542755, -13.177557);
((GeneralPath)shape).curveTo(17.160662, -20.38122, 23.85372, -2.9877279, 12.355255, -6.146307);
((GeneralPath)shape).curveTo(0.85679024, -9.304885, 15.907053, -20.732428, 4.042755, -19.365057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.7927556, -1.1150568);
((GeneralPath)shape).curveTo(13.463302, -1.1150568, 18.074005, 3.769375, 18.074005, 9.791193);
((GeneralPath)shape).curveTo(18.074005, 15.81301, 13.4633, 20.697443, 7.7927556, 20.697443);
((GeneralPath)shape).curveTo(2.1222112, 20.697443, -2.4884946, 15.813011, -2.4884946, 9.791193);
((GeneralPath)shape).curveTo(-2.4884946, 3.7693741, 2.1222103, -1.1150568, 7.7927556, -1.1150568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_0_0;
g.setTransform(defaultTransform__0_0_0_0);
g.setClip(clip__0_0_0_0);
float alpha__0_0_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_1 = g.getClip();
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(41.272727966308594, 20.0), new Point2D.Double(9.090909004211426, 59.73617935180664), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 173, 93, 240),new Color(255, 173, 93, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8587690591812134f, 0.0f, 0.0f, 1.886309027671814f, -32.048789978027344f, -23.760940551757812f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(1.8552552, -16.615057);
((GeneralPath)shape).curveTo(4.3268423, -12.389599, 6.242616, -5.570594, 0.26150525, -2.8650568);
((GeneralPath)shape).curveTo(-5.1689677, 1.0453773, -10.645211, -3.5740318, -12.988495, -8.458807);
((GeneralPath)shape).curveTo(-19.622936, -4.5127587, -12.27151, -3.6567068, -8.957245, -1.5213068);
((GeneralPath)shape).curveTo(-3.2207208, 4.286322, -10.468309, 15.572569, -18.207245, 11.603693);
((GeneralPath)shape).curveTo(-23.99832, 10.346797, -19.449268, 19.469612, -15.488495, 13.916193);
((GeneralPath)shape).curveTo(-6.724279, 9.93738, 0.04226026, 25.43532, -9.401818, 28.759712);
((GeneralPath)shape).curveTo(-15.546361, 29.988605, -5.8175397, 36.645508, -6.6217256, 30.13041);
((GeneralPath)shape).curveTo(-4.8541536, 20.229397, 12.328064, 24.536419, 9.105716, 34.04833);
((GeneralPath)shape).curveTo(5.100879, 40.209793, 17.702448, 38.351902, 11.460828, 33.28359);
((GeneralPath)shape).curveTo(6.6353965, 24.179485, 23.370386, 17.270996, 26.605255, 27.197443);
((GeneralPath)shape).curveTo(30.13475, 31.97409, 33.165424, 22.257687, 26.011505, 23.541193);
((GeneralPath)shape).curveTo(17.15425, 19.561945, 24.492996, 4.430459, 33.261505, 9.134943);
((GeneralPath)shape).curveTo(39.271023, 10.077248, 34.20037, 1.1481862, 30.105255, 6.9786935);
((GeneralPath)shape).curveTo(21.087711, 10.299201, 15.245074, -5.318059, 24.886505, -8.302557);
((GeneralPath)shape).curveTo(29.8154, -11.232163, 20.011862, -14.728683, 21.199005, -8.052557);
((GeneralPath)shape).curveTo(17.609556, 1.1128032, 1.6049923, -5.5786176, 6.292755, -14.740057);
((GeneralPath)shape).curveTo(8.431012, -18.796041, 3.7487464, -16.879204, 1.8552552, -16.615057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(8.105255, -2.8963068);
((GeneralPath)shape).curveTo(20.221607, -2.7038107, 24.260914, 15.523604, 13.660882, 21.061708);
((GeneralPath)shape).curveTo(4.0272064, 27.488108, -8.142912, 15.464196, -3.7384946, 5.353693);
((GeneralPath)shape).curveTo(-1.8222617, 0.4545682, 2.7822824, -2.9495928, 8.105255, -2.8963068);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_1;
g.setTransform(defaultTransform__0_0_0_1);
g.setClip(clip__0_0_0_1);
float alpha__0_0_0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_2 = g.getClip();
AffineTransform defaultTransform__0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.8440920114517212f, 1.037574052810669f, -1.071671962738037f, 0.8172360062599182f, 14.446829795837402f, -50.05820083618164f));
// _0_0_0_2 is ShapeNode
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.454544, 31.636364);
((GeneralPath)shape).curveTo(35.454544, 33.343426, 34.111397, 34.727272, 32.454544, 34.727272);
((GeneralPath)shape).curveTo(30.79769, 34.727272, 29.454544, 33.343426, 29.454544, 31.636364);
((GeneralPath)shape).curveTo(29.454544, 29.929302, 30.79769, 28.545456, 32.454544, 28.545456);
((GeneralPath)shape).curveTo(34.111397, 28.545456, 35.454544, 29.929302, 35.454544, 31.636364);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_2;
g.setTransform(defaultTransform__0_0_0_2);
g.setClip(clip__0_0_0_2);
origAlpha = alpha__0_0_0;
g.setTransform(defaultTransform__0_0_0);
g.setClip(clip__0_0_0);
float alpha__0_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1 = g.getClip();
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(0.5379909873008728f, 0.0f, 0.0f, 0.530135989189148f, 43.549278259277344f, 25.596540451049805f));
// _0_0_1 is CompositeGraphicsNode
float alpha__0_0_1_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_0 = g.getClip();
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_0 is ShapeNode
paint = new Color(255, 97, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.042755, -19.365057);
((GeneralPath)shape).curveTo(-7.8215437, -17.997686, 9.529157, -10.300208, -0.89474475, -4.615057);
((GeneralPath)shape).curveTo(-11.318646, 1.0700942, -8.966936, -17.377476, -16.363495, -8.240057);
((GeneralPath)shape).curveTo(-23.760054, 0.8973612, -5.9015875, -5.6261516, -9.144745, 5.572443);
((GeneralPath)shape).curveTo(-12.387902, 16.771038, -24.11123, 2.111303, -22.707245, 13.666193);
((GeneralPath)shape).curveTo(-21.303259, 25.221083, -13.419629, 8.326636, -7.582245, 18.478693);
((GeneralPath)shape).curveTo(-1.7448606, 28.630749, -20.683088, 26.36878, -11.300995, 33.57244);
((GeneralPath)shape).curveTo(-1.9189007, 40.776108, -8.58071, 23.351362, 2.9177554, 26.509943);
((GeneralPath)shape).curveTo(14.41622, 29.668522, -0.63404477, 41.096066, 11.230255, 39.72869);
((GeneralPath)shape).curveTo(23.094555, 38.36132, 5.7126045, 30.663845, 16.136505, 24.978693);
((GeneralPath)shape).curveTo(26.560406, 19.293543, 24.239948, 37.741108, 31.636505, 28.603693);
((GeneralPath)shape).curveTo(39.033062, 19.466274, 21.143349, 25.98979, 24.386505, 14.791193);
((GeneralPath)shape).curveTo(27.629662, 3.5925972, 39.38424, 18.252333, 37.980255, 6.697443);
((GeneralPath)shape).curveTo(36.576267, -4.8574457, 28.66139, 12.036998, 22.824005, 1.8849432);
((GeneralPath)shape).curveTo(16.986622, -8.267112, 35.924847, -5.9738936, 26.542755, -13.177557);
((GeneralPath)shape).curveTo(17.160662, -20.38122, 23.85372, -2.9877279, 12.355255, -6.146307);
((GeneralPath)shape).curveTo(0.85679024, -9.304885, 15.907053, -20.732428, 4.042755, -19.365057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.7927556, -1.1150568);
((GeneralPath)shape).curveTo(13.463302, -1.1150568, 18.074005, 3.769375, 18.074005, 9.791193);
((GeneralPath)shape).curveTo(18.074005, 15.81301, 13.4633, 20.697443, 7.7927556, 20.697443);
((GeneralPath)shape).curveTo(2.1222112, 20.697443, -2.4884946, 15.813011, -2.4884946, 9.791193);
((GeneralPath)shape).curveTo(-2.4884946, 3.7693741, 2.1222103, -1.1150568, 7.7927556, -1.1150568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.013f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.042755, -19.365057);
((GeneralPath)shape).curveTo(-7.8215437, -17.997686, 9.529157, -10.300208, -0.89474475, -4.615057);
((GeneralPath)shape).curveTo(-11.318646, 1.0700942, -8.966936, -17.377476, -16.363495, -8.240057);
((GeneralPath)shape).curveTo(-23.760054, 0.8973612, -5.9015875, -5.6261516, -9.144745, 5.572443);
((GeneralPath)shape).curveTo(-12.387902, 16.771038, -24.11123, 2.111303, -22.707245, 13.666193);
((GeneralPath)shape).curveTo(-21.303259, 25.221083, -13.419629, 8.326636, -7.582245, 18.478693);
((GeneralPath)shape).curveTo(-1.7448606, 28.630749, -20.683088, 26.36878, -11.300995, 33.57244);
((GeneralPath)shape).curveTo(-1.9189007, 40.776108, -8.58071, 23.351362, 2.9177554, 26.509943);
((GeneralPath)shape).curveTo(14.41622, 29.668522, -0.63404477, 41.096066, 11.230255, 39.72869);
((GeneralPath)shape).curveTo(23.094555, 38.36132, 5.7126045, 30.663845, 16.136505, 24.978693);
((GeneralPath)shape).curveTo(26.560406, 19.293543, 24.239948, 37.741108, 31.636505, 28.603693);
((GeneralPath)shape).curveTo(39.033062, 19.466274, 21.143349, 25.98979, 24.386505, 14.791193);
((GeneralPath)shape).curveTo(27.629662, 3.5925972, 39.38424, 18.252333, 37.980255, 6.697443);
((GeneralPath)shape).curveTo(36.576267, -4.8574457, 28.66139, 12.036998, 22.824005, 1.8849432);
((GeneralPath)shape).curveTo(16.986622, -8.267112, 35.924847, -5.9738936, 26.542755, -13.177557);
((GeneralPath)shape).curveTo(17.160662, -20.38122, 23.85372, -2.9877279, 12.355255, -6.146307);
((GeneralPath)shape).curveTo(0.85679024, -9.304885, 15.907053, -20.732428, 4.042755, -19.365057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.7927556, -1.1150568);
((GeneralPath)shape).curveTo(13.463302, -1.1150568, 18.074005, 3.769375, 18.074005, 9.791193);
((GeneralPath)shape).curveTo(18.074005, 15.81301, 13.4633, 20.697443, 7.7927556, 20.697443);
((GeneralPath)shape).curveTo(2.1222112, 20.697443, -2.4884946, 15.813011, -2.4884946, 9.791193);
((GeneralPath)shape).curveTo(-2.4884946, 3.7693741, 2.1222103, -1.1150568, 7.7927556, -1.1150568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_1_0;
g.setTransform(defaultTransform__0_0_1_0);
g.setClip(clip__0_0_1_0);
float alpha__0_0_1_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_1 = g.getClip();
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(41.272727966308594, 20.0), new Point2D.Double(9.090909004211426, 59.73617935180664), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 173, 93, 240),new Color(255, 173, 93, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8587690591812134f, 0.0f, 0.0f, 1.886309027671814f, -80.94799041748047f, -48.28293991088867f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(1.8552552, -16.615057);
((GeneralPath)shape).curveTo(4.3268423, -12.389599, 6.242616, -5.570594, 0.26150525, -2.8650568);
((GeneralPath)shape).curveTo(-5.1689677, 1.0453773, -10.645211, -3.5740318, -12.988495, -8.458807);
((GeneralPath)shape).curveTo(-19.622936, -4.5127587, -12.27151, -3.6567068, -8.957245, -1.5213068);
((GeneralPath)shape).curveTo(-3.2207208, 4.286322, -10.468309, 15.572569, -18.207245, 11.603693);
((GeneralPath)shape).curveTo(-23.99832, 10.346797, -19.449268, 19.469612, -15.488495, 13.916193);
((GeneralPath)shape).curveTo(-6.724279, 9.93738, 0.04226026, 25.43532, -9.401818, 28.759712);
((GeneralPath)shape).curveTo(-15.546361, 29.988605, -5.8175397, 36.645508, -6.6217256, 30.13041);
((GeneralPath)shape).curveTo(-4.8541536, 20.229397, 12.328064, 24.536419, 9.105716, 34.04833);
((GeneralPath)shape).curveTo(5.100879, 40.209793, 17.702448, 38.351902, 11.460828, 33.28359);
((GeneralPath)shape).curveTo(6.6353965, 24.179485, 23.370386, 17.270996, 26.605255, 27.197443);
((GeneralPath)shape).curveTo(30.13475, 31.97409, 33.165424, 22.257687, 26.011505, 23.541193);
((GeneralPath)shape).curveTo(17.15425, 19.561945, 24.492996, 4.430459, 33.261505, 9.134943);
((GeneralPath)shape).curveTo(39.271023, 10.077248, 34.20037, 1.1481862, 30.105255, 6.9786935);
((GeneralPath)shape).curveTo(21.087711, 10.299201, 15.245074, -5.318059, 24.886505, -8.302557);
((GeneralPath)shape).curveTo(29.8154, -11.232163, 20.011862, -14.728683, 21.199005, -8.052557);
((GeneralPath)shape).curveTo(17.609556, 1.1128032, 1.6049923, -5.5786176, 6.292755, -14.740057);
((GeneralPath)shape).curveTo(8.431012, -18.796041, 3.7487464, -16.879204, 1.8552552, -16.615057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(8.105255, -2.8963068);
((GeneralPath)shape).curveTo(20.221607, -2.7038107, 24.260914, 15.523604, 13.660882, 21.061708);
((GeneralPath)shape).curveTo(4.0272064, 27.488108, -8.142912, 15.464196, -3.7384946, 5.353693);
((GeneralPath)shape).curveTo(-1.8222617, 0.4545682, 2.7822824, -2.9495928, 8.105255, -2.8963068);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_1_1;
g.setTransform(defaultTransform__0_0_1_1);
g.setClip(clip__0_0_1_1);
float alpha__0_0_1_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_2 = g.getClip();
AffineTransform defaultTransform__0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(0.8440920114517212f, 1.037574052810669f, -1.071671962738037f, 0.8172360062599182f, 14.446829795837402f, -50.05820083618164f));
// _0_0_1_2 is ShapeNode
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.454544, 31.636364);
((GeneralPath)shape).curveTo(35.454544, 33.343426, 34.111397, 34.727272, 32.454544, 34.727272);
((GeneralPath)shape).curveTo(30.79769, 34.727272, 29.454544, 33.343426, 29.454544, 31.636364);
((GeneralPath)shape).curveTo(29.454544, 29.929302, 30.79769, 28.545456, 32.454544, 28.545456);
((GeneralPath)shape).curveTo(34.111397, 28.545456, 35.454544, 29.929302, 35.454544, 31.636364);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_1_2;
g.setTransform(defaultTransform__0_0_1_2);
g.setClip(clip__0_0_1_2);
origAlpha = alpha__0_0_1;
g.setTransform(defaultTransform__0_0_1);
g.setClip(clip__0_0_1);
float alpha__0_0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2 = g.getClip();
AffineTransform defaultTransform__0_0_2 = g.getTransform();
g.transform(new AffineTransform(0.5252659916877747f, 0.11632200330495834f, -0.11462400108575821f, 0.5175960063934326f, 13.507800102233887f, 39.80751037597656f));
// _0_0_2 is CompositeGraphicsNode
float alpha__0_0_2_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_0 = g.getClip();
AffineTransform defaultTransform__0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_0 is ShapeNode
paint = new Color(255, 97, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.042755, -19.365057);
((GeneralPath)shape).curveTo(-7.8215437, -17.997686, 9.529157, -10.300208, -0.89474475, -4.615057);
((GeneralPath)shape).curveTo(-11.318646, 1.0700942, -8.966936, -17.377476, -16.363495, -8.240057);
((GeneralPath)shape).curveTo(-23.760054, 0.8973612, -5.9015875, -5.6261516, -9.144745, 5.572443);
((GeneralPath)shape).curveTo(-12.387902, 16.771038, -24.11123, 2.111303, -22.707245, 13.666193);
((GeneralPath)shape).curveTo(-21.303259, 25.221083, -13.419629, 8.326636, -7.582245, 18.478693);
((GeneralPath)shape).curveTo(-1.7448606, 28.630749, -20.683088, 26.36878, -11.300995, 33.57244);
((GeneralPath)shape).curveTo(-1.9189007, 40.776108, -8.58071, 23.351362, 2.9177554, 26.509943);
((GeneralPath)shape).curveTo(14.41622, 29.668522, -0.63404477, 41.096066, 11.230255, 39.72869);
((GeneralPath)shape).curveTo(23.094555, 38.36132, 5.7126045, 30.663845, 16.136505, 24.978693);
((GeneralPath)shape).curveTo(26.560406, 19.293543, 24.239948, 37.741108, 31.636505, 28.603693);
((GeneralPath)shape).curveTo(39.033062, 19.466274, 21.143349, 25.98979, 24.386505, 14.791193);
((GeneralPath)shape).curveTo(27.629662, 3.5925972, 39.38424, 18.252333, 37.980255, 6.697443);
((GeneralPath)shape).curveTo(36.576267, -4.8574457, 28.66139, 12.036998, 22.824005, 1.8849432);
((GeneralPath)shape).curveTo(16.986622, -8.267112, 35.924847, -5.9738936, 26.542755, -13.177557);
((GeneralPath)shape).curveTo(17.160662, -20.38122, 23.85372, -2.9877279, 12.355255, -6.146307);
((GeneralPath)shape).curveTo(0.85679024, -9.304885, 15.907053, -20.732428, 4.042755, -19.365057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.7927556, -1.1150568);
((GeneralPath)shape).curveTo(13.463302, -1.1150568, 18.074005, 3.769375, 18.074005, 9.791193);
((GeneralPath)shape).curveTo(18.074005, 15.81301, 13.4633, 20.697443, 7.7927556, 20.697443);
((GeneralPath)shape).curveTo(2.1222112, 20.697443, -2.4884946, 15.813011, -2.4884946, 9.791193);
((GeneralPath)shape).curveTo(-2.4884946, 3.7693741, 2.1222103, -1.1150568, 7.7927556, -1.1150568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(1.013f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.042755, -19.365057);
((GeneralPath)shape).curveTo(-7.8215437, -17.997686, 9.529157, -10.300208, -0.89474475, -4.615057);
((GeneralPath)shape).curveTo(-11.318646, 1.0700942, -8.966936, -17.377476, -16.363495, -8.240057);
((GeneralPath)shape).curveTo(-23.760054, 0.8973612, -5.9015875, -5.6261516, -9.144745, 5.572443);
((GeneralPath)shape).curveTo(-12.387902, 16.771038, -24.11123, 2.111303, -22.707245, 13.666193);
((GeneralPath)shape).curveTo(-21.303259, 25.221083, -13.419629, 8.326636, -7.582245, 18.478693);
((GeneralPath)shape).curveTo(-1.7448606, 28.630749, -20.683088, 26.36878, -11.300995, 33.57244);
((GeneralPath)shape).curveTo(-1.9189007, 40.776108, -8.58071, 23.351362, 2.9177554, 26.509943);
((GeneralPath)shape).curveTo(14.41622, 29.668522, -0.63404477, 41.096066, 11.230255, 39.72869);
((GeneralPath)shape).curveTo(23.094555, 38.36132, 5.7126045, 30.663845, 16.136505, 24.978693);
((GeneralPath)shape).curveTo(26.560406, 19.293543, 24.239948, 37.741108, 31.636505, 28.603693);
((GeneralPath)shape).curveTo(39.033062, 19.466274, 21.143349, 25.98979, 24.386505, 14.791193);
((GeneralPath)shape).curveTo(27.629662, 3.5925972, 39.38424, 18.252333, 37.980255, 6.697443);
((GeneralPath)shape).curveTo(36.576267, -4.8574457, 28.66139, 12.036998, 22.824005, 1.8849432);
((GeneralPath)shape).curveTo(16.986622, -8.267112, 35.924847, -5.9738936, 26.542755, -13.177557);
((GeneralPath)shape).curveTo(17.160662, -20.38122, 23.85372, -2.9877279, 12.355255, -6.146307);
((GeneralPath)shape).curveTo(0.85679024, -9.304885, 15.907053, -20.732428, 4.042755, -19.365057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(7.7927556, -1.1150568);
((GeneralPath)shape).curveTo(13.463302, -1.1150568, 18.074005, 3.769375, 18.074005, 9.791193);
((GeneralPath)shape).curveTo(18.074005, 15.81301, 13.4633, 20.697443, 7.7927556, 20.697443);
((GeneralPath)shape).curveTo(2.1222112, 20.697443, -2.4884946, 15.813011, -2.4884946, 9.791193);
((GeneralPath)shape).curveTo(-2.4884946, 3.7693741, 2.1222103, -1.1150568, 7.7927556, -1.1150568);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_2_0;
g.setTransform(defaultTransform__0_0_2_0);
g.setClip(clip__0_0_2_0);
float alpha__0_0_2_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_1 = g.getClip();
AffineTransform defaultTransform__0_0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_1 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(41.272727966308594, 20.0), new Point2D.Double(9.090909004211426, 59.73617935180664), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 173, 93, 240),new Color(255, 173, 93, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8148020505905151f, -0.4078499972820282f, 0.4018949866294861f, 1.8416889905929565f, -40.51237869262695f, -67.80384826660156f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(1.8552552, -16.615057);
((GeneralPath)shape).curveTo(4.3268423, -12.389599, 6.242616, -5.570594, 0.26150525, -2.8650568);
((GeneralPath)shape).curveTo(-5.1689677, 1.0453773, -10.645211, -3.5740318, -12.988495, -8.458807);
((GeneralPath)shape).curveTo(-19.622936, -4.5127587, -12.27151, -3.6567068, -8.957245, -1.5213068);
((GeneralPath)shape).curveTo(-3.2207208, 4.286322, -10.468309, 15.572569, -18.207245, 11.603693);
((GeneralPath)shape).curveTo(-23.99832, 10.346797, -19.449268, 19.469612, -15.488495, 13.916193);
((GeneralPath)shape).curveTo(-6.724279, 9.93738, 0.04226026, 25.43532, -9.401818, 28.759712);
((GeneralPath)shape).curveTo(-15.546361, 29.988605, -5.8175397, 36.645508, -6.6217256, 30.13041);
((GeneralPath)shape).curveTo(-4.8541536, 20.229397, 12.328064, 24.536419, 9.105716, 34.04833);
((GeneralPath)shape).curveTo(5.100879, 40.209793, 17.702448, 38.351902, 11.460828, 33.28359);
((GeneralPath)shape).curveTo(6.6353965, 24.179485, 23.370386, 17.270996, 26.605255, 27.197443);
((GeneralPath)shape).curveTo(30.13475, 31.97409, 33.165424, 22.257687, 26.011505, 23.541193);
((GeneralPath)shape).curveTo(17.15425, 19.561945, 24.492996, 4.430459, 33.261505, 9.134943);
((GeneralPath)shape).curveTo(39.271023, 10.077248, 34.20037, 1.1481862, 30.105255, 6.9786935);
((GeneralPath)shape).curveTo(21.087711, 10.299201, 15.245074, -5.318059, 24.886505, -8.302557);
((GeneralPath)shape).curveTo(29.8154, -11.232163, 20.011862, -14.728683, 21.199005, -8.052557);
((GeneralPath)shape).curveTo(17.609556, 1.1128032, 1.6049923, -5.5786176, 6.292755, -14.740057);
((GeneralPath)shape).curveTo(8.431012, -18.796041, 3.7487464, -16.879204, 1.8552552, -16.615057);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(8.105255, -2.8963068);
((GeneralPath)shape).curveTo(20.221607, -2.7038107, 24.260914, 15.523604, 13.660882, 21.061708);
((GeneralPath)shape).curveTo(4.0272064, 27.488108, -8.142912, 15.464196, -3.7384946, 5.353693);
((GeneralPath)shape).curveTo(-1.8222617, 0.4545682, 2.7822824, -2.9495928, 8.105255, -2.8963068);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_2_1;
g.setTransform(defaultTransform__0_0_2_1);
g.setClip(clip__0_0_2_1);
float alpha__0_0_2_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_2 = g.getClip();
AffineTransform defaultTransform__0_0_2_2 = g.getTransform();
g.transform(new AffineTransform(0.8440920114517212f, 1.037574052810669f, -1.071671962738037f, 0.8172360062599182f, 14.446829795837402f, -50.05820083618164f));
// _0_0_2_2 is ShapeNode
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.454544, 31.636364);
((GeneralPath)shape).curveTo(35.454544, 33.343426, 34.111397, 34.727272, 32.454544, 34.727272);
((GeneralPath)shape).curveTo(30.79769, 34.727272, 29.454544, 33.343426, 29.454544, 31.636364);
((GeneralPath)shape).curveTo(29.454544, 29.929302, 30.79769, 28.545456, 32.454544, 28.545456);
((GeneralPath)shape).curveTo(34.111397, 28.545456, 35.454544, 29.929302, 35.454544, 31.636364);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_2_2;
g.setTransform(defaultTransform__0_0_2_2);
g.setClip(clip__0_0_2_2);
float alpha__0_0_2_3 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3 = g.getClip();
AffineTransform defaultTransform__0_0_2_3 = g.getTransform();
g.transform(new AffineTransform(2.514115571975708f, -0.5650100708007812f, 0.5567623972892761f, 2.551370859146118f, -57.522430419921875f, -75.43453979492188f));
// _0_0_2_3 is CompositeGraphicsNode
float alpha__0_0_2_3_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0 = g.getTransform();
g.transform(new AffineTransform(0.0778672993183136f, 0.0f, 0.0f, 0.0778672993183136f, -10.27236557006836f, -6.8641791343688965f));
// _0_0_2_3_0 is CompositeGraphicsNode
float alpha__0_0_2_3_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0 is CompositeGraphicsNode
float alpha__0_0_2_3_0_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0_0 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(358.955810546875, 473.860595703125), new Point2D.Double(361.0169677734375, 463.0550537109375), new float[] {0.0f,1.0f}, new Color[] {new Color(160, 137, 44, 255),new Color(222, 205, 135, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(6.137719631195068f, 0.0f, 0.0f, 6.137719631195068f, -1749.45263671875f, -2198.3505859375f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(484.53867, 713.5791);
((GeneralPath)shape).curveTo(529.4421, 723.7866, 555.55383, 657.68195, 518.7727, 647.7444);
((GeneralPath)shape).lineTo(287.91232, 632.38293);
((GeneralPath)shape).curveTo(330.5567, 652.7495, 296.5927, 695.61163, 252.36162, 691.6342);
((GeneralPath)shape).lineTo(484.53864, 713.5791);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(6.1377196f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(484.53867, 713.5791);
((GeneralPath)shape).curveTo(529.4421, 723.7866, 555.55383, 657.68195, 518.7727, 647.7444);
((GeneralPath)shape).lineTo(287.91232, 632.38293);
((GeneralPath)shape).curveTo(330.5567, 652.7495, 296.5927, 695.61163, 252.36162, 691.6342);
((GeneralPath)shape).lineTo(484.53864, 713.5791);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_2_3_0_0_0;
g.setTransform(defaultTransform__0_0_2_3_0_0_0);
g.setClip(clip__0_0_2_3_0_0_0);
float alpha__0_0_2_3_0_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0_0_1 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0_1 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(348.67462158203125, 467.99609375), new Point2D.Double(349.3330993652344, 462.38702392578125), new float[] {0.0f,1.0f}, new Color[] {new Color(160, 137, 44, 255),new Color(233, 221, 175, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(6.137719631195068f, 0.0f, 0.0f, 6.137719631195068f, -1749.45263671875f, -2198.3505859375f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(518.14264, 647.60284);
((GeneralPath)shape).curveTo(485.0709, 644.83673, 491.00696, 674.16675, 496.38895, 680.66174);
((GeneralPath)shape).lineTo(263.77295, 662.228);
((GeneralPath)shape).curveTo(255.00816, 650.8705, 263.62738, 631.79047, 290.10684, 632.38293);
((GeneralPath)shape).lineTo(518.14264, 647.60284);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(6.1377196f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(518.14264, 647.60284);
((GeneralPath)shape).curveTo(485.0709, 644.83673, 491.00696, 674.16675, 496.38895, 680.66174);
((GeneralPath)shape).lineTo(263.77295, 662.228);
((GeneralPath)shape).curveTo(255.00816, 650.8705, 263.62738, 631.79047, 290.10684, 632.38293);
((GeneralPath)shape).lineTo(518.14264, 647.60284);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_2_3_0_0_1;
g.setTransform(defaultTransform__0_0_2_3_0_0_1);
g.setClip(clip__0_0_2_3_0_0_1);
float alpha__0_0_2_3_0_0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0_0_2 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0_2 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(339.4884033203125, 471.6433410644531), new Point2D.Double(342.9720458984375, 421.3695068359375), new float[] {0.0f,0.7228173f,1.0f}, new Color[] {new Color(222, 205, 135, 255),new Color(244, 237, 212, 255),new Color(222, 205, 135, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(6.137719631195068f, 0.0f, 0.0f, 6.137719631195068f, -1749.45263671875f, -2198.3505859375f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(292.70074, 384.37033);
((GeneralPath)shape).curveTo(388.97885, 404.86935, 169.7303, 676.40063, 251.64577, 691.6204);
((GeneralPath)shape).lineTo(488.7051, 714.1344);
((GeneralPath)shape).curveTo(381.6854, 679.2621, 629.938, 417.48895, 536.3818, 388.3434);
((GeneralPath)shape).lineTo(292.70074, 384.37036);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(6.1377196f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(292.70074, 384.37033);
((GeneralPath)shape).curveTo(388.97885, 404.86935, 169.7303, 676.40063, 251.64577, 691.6204);
((GeneralPath)shape).lineTo(488.7051, 714.1344);
((GeneralPath)shape).curveTo(381.6854, 679.2621, 629.938, 417.48895, 536.3818, 388.3434);
((GeneralPath)shape).lineTo(292.70074, 384.37036);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_2_3_0_0_2;
g.setTransform(defaultTransform__0_0_2_3_0_0_2);
g.setClip(clip__0_0_2_3_0_0_2);
float alpha__0_0_2_3_0_0_3 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0_0_3 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0_3 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(361.7032470703125, 424.0807800292969), new Point2D.Double(360.8488464355469, 429.42950439453125), new float[] {0.0f,1.0f}, new Color[] {new Color(211, 188, 95, 255),new Color(160, 137, 44, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(6.137719631195068f, 0.0f, 0.0f, 6.137719631195068f, -1749.45263671875f, -2198.3505859375f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(531.08435, 404.23563);
((GeneralPath)shape).curveTo(537.26044, 409.00333, 547.66595, 431.20825, 523.977, 434.29846);
((GeneralPath)shape).lineTo(263.56497, 427.76498);
((GeneralPath)shape).curveTo(291.27808, 418.1855, 281.06284, 407.679, 274.1598, 400.2626);
((GeneralPath)shape).lineTo(531.08435, 404.23563);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(6.1377196f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(531.08435, 404.23563);
((GeneralPath)shape).curveTo(537.26044, 409.00333, 547.66595, 431.20825, 523.977, 434.29846);
((GeneralPath)shape).lineTo(263.56497, 427.76498);
((GeneralPath)shape).curveTo(291.27808, 418.1855, 281.06284, 407.679, 274.1598, 400.2626);
((GeneralPath)shape).lineTo(531.08435, 404.23563);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_2_3_0_0_3;
g.setTransform(defaultTransform__0_0_2_3_0_0_3);
g.setClip(clip__0_0_2_3_0_0_3);
float alpha__0_0_2_3_0_0_4 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_0_0_4 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_0_0_4 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(345.18450927734375, 429.207275390625), new Point2D.Double(346.89337158203125, 420.2301330566406), new float[] {0.0f,1.0f}, new Color[] {new Color(233, 221, 175, 255),new Color(244, 238, 215, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(6.137719631195068f, 0.0f, 0.0f, 6.137719631195068f, -1749.45263671875f, -2198.3505859375f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(529.76, 388.34335);
((GeneralPath)shape).curveTo(501.7777, 398.98236, 503.41943, 429.53076, 518.63544, 433.98944);
((GeneralPath)shape).lineTo(265.63974, 427.98572);
((GeneralPath)shape).curveTo(254.5579, 428.02283, 248.52011, 384.623, 291.37637, 383.97305);
((GeneralPath)shape).lineTo(529.76, 388.34335);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(6.1377196f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(529.76, 388.34335);
((GeneralPath)shape).curveTo(501.7777, 398.98236, 503.41943, 429.53076, 518.63544, 433.98944);
((GeneralPath)shape).lineTo(265.63974, 427.98572);
((GeneralPath)shape).curveTo(254.5579, 428.02283, 248.52011, 384.623, 291.37637, 383.97305);
((GeneralPath)shape).lineTo(529.76, 388.34335);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_2_3_0_0_4;
g.setTransform(defaultTransform__0_0_2_3_0_0_4);
g.setClip(clip__0_0_2_3_0_0_4);
origAlpha = alpha__0_0_2_3_0_0;
g.setTransform(defaultTransform__0_0_2_3_0_0);
g.setClip(clip__0_0_2_3_0_0);
origAlpha = alpha__0_0_2_3_0;
g.setTransform(defaultTransform__0_0_2_3_0);
g.setClip(clip__0_0_2_3_0);
float alpha__0_0_2_3_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_2_3_1 = g.getClip();
AffineTransform defaultTransform__0_0_2_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, -0.3057294189929962f, 1.0f, 0.0f, 0.0f));
// _0_0_2_3_1 is TextNode of 'do {  run()}'
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.636518, 30.226116);
((GeneralPath)shape).lineTo(25.636518, 28.746624);
((GeneralPath)shape).lineTo(26.085737, 28.746624);
((GeneralPath)shape).lineTo(26.085737, 32.545452);
((GeneralPath)shape).lineTo(25.636518, 32.545452);
((GeneralPath)shape).lineTo(25.636518, 32.135296);
((GeneralPath)shape).quadTo(25.494917, 32.379436, 25.279259, 32.498253);
((GeneralPath)shape).quadTo(25.063602, 32.617065, 24.760868, 32.617065);
((GeneralPath)shape).quadTo(24.264448, 32.617065, 23.953575, 32.220745);
((GeneralPath)shape).quadTo(23.642704, 31.824423, 23.642704, 31.179892);
((GeneralPath)shape).quadTo(23.642704, 30.53536, 23.953575, 30.139853);
((GeneralPath)shape).quadTo(24.264448, 29.744345, 24.760868, 29.744345);
((GeneralPath)shape).quadTo(25.063602, 29.744345, 25.279259, 29.863161);
((GeneralPath)shape).quadTo(25.494917, 29.981976, 25.636518, 30.226116);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.106571, 31.179892);
((GeneralPath)shape).quadTo(24.106571, 31.676311, 24.31002, 31.957888);
((GeneralPath)shape).quadTo(24.513472, 32.239464, 24.869917, 32.239464);
((GeneralPath)shape).quadTo(25.226362, 32.239464, 25.43144, 31.957888);
((GeneralPath)shape).quadTo(25.636518, 31.676311, 25.636518, 31.179892);
((GeneralPath)shape).quadTo(25.636518, 30.6851, 25.43144, 30.402712);
((GeneralPath)shape).quadTo(25.226362, 30.120321, 24.869917, 30.120321);
((GeneralPath)shape).quadTo(24.513472, 30.120321, 24.31002, 30.402712);
((GeneralPath)shape).quadTo(24.106571, 30.6851, 24.106571, 31.179892);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.071415, 30.125204);
((GeneralPath)shape).quadTo(27.710087, 30.125204, 27.500126, 30.407595);
((GeneralPath)shape).quadTo(27.290165, 30.689983, 27.290165, 31.179892);
((GeneralPath)shape).quadTo(27.290165, 31.671429, 27.498497, 31.953005);
((GeneralPath)shape).quadTo(27.706831, 32.23458, 28.071415, 32.23458);
((GeneralPath)shape).quadTo(28.429487, 32.23458, 28.639448, 31.951376);
((GeneralPath)shape).quadTo(28.84941, 31.668173, 28.84941, 31.179892);
((GeneralPath)shape).quadTo(28.84941, 30.694866, 28.639448, 30.410036);
((GeneralPath)shape).quadTo(28.429487, 30.125204, 28.071415, 30.125204);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.071415, 29.744345);
((GeneralPath)shape).quadTo(28.657352, 29.744345, 28.991825, 30.125204);
((GeneralPath)shape).quadTo(29.326298, 30.506063, 29.326298, 31.179892);
((GeneralPath)shape).quadTo(29.326298, 31.852093, 28.991825, 32.23458);
((GeneralPath)shape).quadTo(28.657352, 32.617065, 28.071415, 32.617065);
((GeneralPath)shape).quadTo(27.482222, 32.617065, 27.149376, 32.23458);
((GeneralPath)shape).quadTo(26.816532, 31.852093, 26.816532, 31.179892);
((GeneralPath)shape).quadTo(26.816532, 30.506063, 27.149376, 30.125204);
((GeneralPath)shape).quadTo(27.482222, 29.744345, 28.071415, 29.744345);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.745243, 33.00932);
((GeneralPath)shape).lineTo(33.745243, 33.36088);
((GeneralPath)shape).lineTo(33.593876, 33.36088);
((GeneralPath)shape).quadTo(32.98515, 33.36088, 32.77926, 33.180218);
((GeneralPath)shape).quadTo(32.573368, 32.999554, 32.573368, 32.45919);
((GeneralPath)shape).lineTo(32.573368, 31.876507);
((GeneralPath)shape).quadTo(32.573368, 31.50704, 32.441532, 31.365438);
((GeneralPath)shape).quadTo(32.309696, 31.223837, 31.963017, 31.223837);
((GeneralPath)shape).lineTo(31.813276, 31.223837);
((GeneralPath)shape).lineTo(31.813276, 30.87553);
((GeneralPath)shape).lineTo(31.963017, 30.87553);
((GeneralPath)shape).quadTo(32.31132, 30.87553, 32.442345, 30.734743);
((GeneralPath)shape).quadTo(32.573368, 30.593954, 32.573368, 30.230999);
((GeneralPath)shape).lineTo(32.573368, 29.645061);
((GeneralPath)shape).quadTo(32.573368, 29.104696, 32.77926, 28.925661);
((GeneralPath)shape).quadTo(32.98515, 28.746624, 33.593876, 28.746624);
((GeneralPath)shape).lineTo(33.745243, 28.746624);
((GeneralPath)shape).lineTo(33.745243, 29.09493);
((GeneralPath)shape).lineTo(33.579227, 29.09493);
((GeneralPath)shape).quadTo(33.234173, 29.09493, 33.129192, 29.202353);
((GeneralPath)shape).quadTo(33.02421, 29.309774, 33.02421, 29.654827);
((GeneralPath)shape).lineTo(33.02421, 30.260296);
((GeneralPath)shape).quadTo(33.02421, 30.642782, 32.913536, 30.816122);
((GeneralPath)shape).quadTo(32.80286, 30.989462, 32.534306, 31.051311);
((GeneralPath)shape).quadTo(32.804485, 31.116415, 32.91435, 31.289755);
((GeneralPath)shape).quadTo(33.02421, 31.463095, 33.02421, 31.843954);
((GeneralPath)shape).lineTo(33.02421, 32.449425);
((GeneralPath)shape).quadTo(33.02421, 32.794476, 33.129192, 32.901897);
((GeneralPath)shape).quadTo(33.234173, 33.00932, 33.579227, 33.00932);
((GeneralPath)shape).lineTo(33.745243, 33.00932);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.600386, 35.231);
((GeneralPath)shape).quadTo(28.525517, 35.187054, 28.435997, 35.165894);
((GeneralPath)shape).quadTo(28.34648, 35.144737, 28.239058, 35.144737);
((GeneralPath)shape).quadTo(27.858198, 35.144737, 27.654747, 35.392944);
((GeneralPath)shape).quadTo(27.451298, 35.641155, 27.451298, 36.105022);
((GeneralPath)shape).lineTo(27.451298, 37.545452);
((GeneralPath)shape).lineTo(26.998823, 37.545452);
((GeneralPath)shape).lineTo(26.998823, 34.811077);
((GeneralPath)shape).lineTo(27.451298, 34.811077);
((GeneralPath)shape).lineTo(27.451298, 35.23588);
((GeneralPath)shape).quadTo(27.5929, 34.98686, 27.81995, 34.8656);
((GeneralPath)shape).quadTo(28.047, 34.744347, 28.370893, 34.744347);
((GeneralPath)shape).quadTo(28.418095, 34.744347, 28.474247, 34.750854);
((GeneralPath)shape).quadTo(28.5304, 34.757366, 28.598759, 34.76876);
((GeneralPath)shape).lineTo(28.600386, 35.231);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.02519, 36.46635);
((GeneralPath)shape).lineTo(29.02519, 34.811077);
((GeneralPath)shape).lineTo(29.47441, 34.811077);
((GeneralPath)shape).lineTo(29.47441, 36.44845);
((GeneralPath)shape).quadTo(29.47441, 36.837444, 29.625776, 37.031128);
((GeneralPath)shape).quadTo(29.777143, 37.224815, 30.079878, 37.224815);
((GeneralPath)shape).quadTo(30.444462, 37.224815, 30.655235, 36.99288);
((GeneralPath)shape).quadTo(30.86601, 36.76095, 30.86601, 36.360558);
((GeneralPath)shape).lineTo(30.86601, 34.811077);
((GeneralPath)shape).lineTo(31.31523, 34.811077);
((GeneralPath)shape).lineTo(31.31523, 37.545452);
((GeneralPath)shape).lineTo(30.86601, 37.545452);
((GeneralPath)shape).lineTo(30.86601, 37.12553);
((GeneralPath)shape).quadTo(30.70325, 37.374554, 30.486778, 37.49581);
((GeneralPath)shape).quadTo(30.270308, 37.617065, 29.985477, 37.617065);
((GeneralPath)shape).quadTo(29.513472, 37.617065, 29.269331, 37.323284);
((GeneralPath)shape).quadTo(29.02519, 37.029503, 29.02519, 36.46635);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.156376, 34.744347);
((GeneralPath)shape).lineTo(30.156376, 34.744347);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.51347, 35.89506);
((GeneralPath)shape).lineTo(34.51347, 37.545452);
((GeneralPath)shape).lineTo(34.06425, 37.545452);
((GeneralPath)shape).lineTo(34.06425, 35.90971);
((GeneralPath)shape).quadTo(34.06425, 35.520714, 33.912884, 35.327843);
((GeneralPath)shape).quadTo(33.761517, 35.13497, 33.458782, 35.13497);
((GeneralPath)shape).quadTo(33.09583, 35.13497, 32.885868, 35.366905);
((GeneralPath)shape).quadTo(32.675907, 35.59884, 32.675907, 35.99923);
((GeneralPath)shape).lineTo(32.675907, 37.545452);
((GeneralPath)shape).lineTo(32.22343, 37.545452);
((GeneralPath)shape).lineTo(32.22343, 34.811077);
((GeneralPath)shape).lineTo(32.675907, 34.811077);
((GeneralPath)shape).lineTo(32.675907, 35.23588);
((GeneralPath)shape).quadTo(32.83704, 34.988487, 33.055138, 34.866417);
((GeneralPath)shape).quadTo(33.273235, 34.744347, 33.559696, 34.744347);
((GeneralPath)shape).quadTo(34.03007, 34.744347, 34.27177, 35.0365);
((GeneralPath)shape).quadTo(34.51347, 35.328655, 34.51347, 35.89506);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.489384, 33.751507);
((GeneralPath)shape).quadTo(36.162235, 34.31303, 36.003544, 34.862347);
((GeneralPath)shape).quadTo(35.844852, 35.411663, 35.844852, 35.974815);
((GeneralPath)shape).quadTo(35.844852, 36.539593, 36.00436, 37.09298);
((GeneralPath)shape).quadTo(36.163864, 37.646362, 36.489384, 38.20463);
((GeneralPath)shape).lineTo(36.09876, 38.20463);
((GeneralPath)shape).quadTo(35.732548, 37.631714, 35.55026, 37.076702);
((GeneralPath)shape).quadTo(35.367966, 36.52169, 35.367966, 35.974815);
((GeneralPath)shape).quadTo(35.367966, 35.431194, 35.54863, 34.879436);
((GeneralPath)shape).quadTo(35.729294, 34.32768, 36.09876, 33.751507);
((GeneralPath)shape).lineTo(36.489384, 33.751507);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.289352, 33.751507);
((GeneralPath)shape).lineTo(37.679977, 33.751507);
((GeneralPath)shape).quadTo(38.04619, 34.32768, 38.22848, 34.879436);
((GeneralPath)shape).quadTo(38.41077, 35.431194, 38.41077, 35.974815);
((GeneralPath)shape).quadTo(38.41077, 36.52169, 38.22848, 37.076702);
((GeneralPath)shape).quadTo(38.04619, 37.631714, 37.679977, 38.20463);
((GeneralPath)shape).lineTo(37.289352, 38.20463);
((GeneralPath)shape).quadTo(37.614872, 37.646362, 37.77438, 37.09298);
((GeneralPath)shape).quadTo(37.933884, 36.539593, 37.933884, 35.974815);
((GeneralPath)shape).quadTo(37.933884, 35.411663, 37.77438, 34.862347);
((GeneralPath)shape).quadTo(37.614872, 34.31303, 37.289352, 33.751507);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.99101, 43.00932);
((GeneralPath)shape).lineTo(24.16191, 43.00932);
((GeneralPath)shape).quadTo(24.503706, 43.00932, 24.607872, 42.90434);
((GeneralPath)shape).quadTo(24.71204, 42.79936, 24.71204, 42.449425);
((GeneralPath)shape).lineTo(24.71204, 41.843956);
((GeneralPath)shape).quadTo(24.71204, 41.463097, 24.821903, 41.289757);
((GeneralPath)shape).quadTo(24.931767, 41.116417, 25.201948, 41.05131);
((GeneralPath)shape).quadTo(24.931767, 40.989464, 24.821903, 40.816124);
((GeneralPath)shape).quadTo(24.71204, 40.642784, 24.71204, 40.260296);
((GeneralPath)shape).lineTo(24.71204, 39.654827);
((GeneralPath)shape).quadTo(24.71204, 39.308147, 24.607872, 39.201538);
((GeneralPath)shape).quadTo(24.503706, 39.094933, 24.16191, 39.094933);
((GeneralPath)shape).lineTo(23.99101, 39.094933);
((GeneralPath)shape).lineTo(23.99101, 38.746624);
((GeneralPath)shape).lineTo(24.145634, 38.746624);
((GeneralPath)shape).quadTo(24.75273, 38.746624, 24.956993, 38.92566);
((GeneralPath)shape).quadTo(25.161259, 39.1047, 25.161259, 39.64506);
((GeneralPath)shape).lineTo(25.161259, 40.231);
((GeneralPath)shape).quadTo(25.161259, 40.593956, 25.293095, 40.73474);
((GeneralPath)shape).quadTo(25.42493, 40.87553, 25.77161, 40.87553);
((GeneralPath)shape).lineTo(25.922977, 40.87553);
((GeneralPath)shape).lineTo(25.922977, 41.22384);
((GeneralPath)shape).lineTo(25.77161, 41.22384);
((GeneralPath)shape).quadTo(25.42493, 41.22384, 25.293095, 41.36544);
((GeneralPath)shape).quadTo(25.161259, 41.507042, 25.161259, 41.876507);
((GeneralPath)shape).lineTo(25.161259, 42.45919);
((GeneralPath)shape).quadTo(25.161259, 42.999554, 24.956993, 43.180218);
((GeneralPath)shape).quadTo(24.75273, 43.36088, 24.145634, 43.36088);
((GeneralPath)shape).lineTo(23.99101, 43.36088);
((GeneralPath)shape).lineTo(23.99101, 43.00932);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_2_3_1;
g.setTransform(defaultTransform__0_0_2_3_1);
g.setClip(clip__0_0_2_3_1);
origAlpha = alpha__0_0_2_3;
g.setTransform(defaultTransform__0_0_2_3);
g.setClip(clip__0_0_2_3);
origAlpha = alpha__0_0_2;
g.setTransform(defaultTransform__0_0_2);
g.setClip(clip__0_0_2);
origAlpha = alpha__0_0;
g.setTransform(defaultTransform__0_0);
g.setClip(clip__0_0);
origAlpha = alpha__0;
g.setTransform(defaultTransform__0);
g.setClip(clip__0);
g.setTransform(defaultTransform_);
g.setClip(clip_);

	}
	
	public Image getImage() {
		BufferedImage image =
            new BufferedImage(getIconWidth(), getIconHeight(),
                    BufferedImage.TYPE_INT_ARGB);
    	Graphics2D g = image.createGraphics();
    	paintIcon(null, g, 0, 0);
    	g.dispose();
    	return image;
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 2;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 64;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 64;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public ScriptableControllerIcon() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}
	
	/**
	 * Creates a new transcoded SVG image with the given dimensions.
	 *
	 * @param size the dimensions of the icon
	 */
	public ScriptableControllerIcon(Dimension size) {
	this.width = size.width;
	this.height = size.width;
	}

	public ScriptableControllerIcon(int width, int height) {
	this.width = width;
	this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);
						
		Area clip = new Area(new Rectangle(0, 0, this.width, this.height));		
		if (g2d.getClip() != null) clip.intersect(new Area(g2d.getClip()));		
		g2d.setClip(clip);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

